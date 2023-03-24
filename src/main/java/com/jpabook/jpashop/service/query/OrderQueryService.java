package com.jpabook.jpashop.service.query;

import static java.util.stream.Collectors.toList;

import com.jpabook.jpashop.repository.OrderRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderQueryService {

    private final OrderRepository orderRepository;

    public List<OrderDto> ordersV3() {
        return orderRepository.findAllWithItem().stream()
            .map(OrderDto::new)
            .collect(toList());
    }
}
