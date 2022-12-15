package com.example.magasinstock.service;

import com.example.magasinstock.entities.Stock;
import com.example.magasinstock.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StockServiceImpl implements ICrudService<Stock> {
    StockRepository stockRepository;
    @Override
    public Stock add(Stock object) {
        return stockRepository.save(object);
    }

    @Override
    public Stock update(Stock object) {
        return stockRepository.save(object);
    }

    @Override
    public void delete(long id) {
        stockRepository.deleteById(id);
    }

    @Override
    public List<Stock> getAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stock getOne(long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Scheduled(cron = "*/10 * * * * *")
    void retrieveStatusStock(){
        List<Stock> stocks = stockRepository.findAll();
        for (Stock stock : stocks){
            if (stock.getQteMin()>stock.getQte())
                System.out.println(stock);
        }

    }
}
