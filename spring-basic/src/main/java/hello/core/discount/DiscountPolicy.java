package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {


    // 할인대상 금액
    int discount(Member membetr, int price);
}
