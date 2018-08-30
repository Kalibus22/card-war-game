package game.dto;

import java.util.Map;

/**
 * @author ruslan.gramatic
 */
public class CardImpactDto {
    private Integer id;
    private CardGroupDto cardGroupDto;
    private Map<Integer, Float> p1BuildingAmountMap;
    private Map<Integer, Float> p2BuildingAmountMap;
    private Map<Integer, Float> p1ResourceAmountMap;
    private Map<Integer, Float> p2ResourceAmountMap;
    private Map<Integer, Float> p1UpgradeAmountMap;
    private Map<Integer, Float> p2UpgradeAmountMap;
    private Map<Integer, Float> necessaryBuildingAmountMap;
    private Map<Integer, Float> necessaryUpgradeAmountMap;

    public Integer getId() {
        return id;
    }

    public Map<Integer, Float> getP1UpgradeAmountMap() {
        return p1UpgradeAmountMap;
    }

    public Map<Integer, Float> getP2UpgradeAmountMap() {
        return p2UpgradeAmountMap;
    }
}
