package com.example.consumerbe.domain.dto;

import com.example.consumerbe.domain.event.RuleHitEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RuleResult {
    private boolean isHit = false;
    private RuleHitEvent ruleHit;
}
