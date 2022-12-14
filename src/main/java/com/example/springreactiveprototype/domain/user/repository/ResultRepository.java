package com.example.springreactiveprototype.domain.user.repository;

import com.example.springreactiveprototype.domain.user.model.Result;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ResultRepository extends ReactiveMongoRepository<Result, String> {
    Mono<Result> findFirstByRollNumber(int rollNumber);
    Mono<Result> findFirstByRollNumberAndGrade(int rollNumber, int grade);
    Mono<Long> countByObtainedMarksIsGreaterThan(double obtainedMarks);
    Flux<Result> findByObtainedMarksLessThanEqual(double obtainedMarks);

//    Mono<Result> decrementLesserGradeByOne(int rollNumber, int grade);
}
