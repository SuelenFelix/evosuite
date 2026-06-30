package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getSumBattleMasterHighScore_135357867839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3179668;

    public ExternalUserData_getSumBattleMasterHighScore_135357867839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3179668 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3179668, term3179668.getClass(), "accessCode", "hcpKnBdHxQ");
        setField(term3179668, term3179668.getClass(), "userName", "zYiiGAolEh");
        setIntField(term3179668, term3179668.getClass(), "level", -1798359412);
        setIntField(term3179668, term3179668.getClass(), "reincarnationNum", -259820111);
        setLongField(term3179668, term3179668.getClass(), "exp", -7170268639411392978L);
        setLongField(term3179668, term3179668.getClass(), "point", 7381375414068413571L);
        setLongField(term3179668, term3179668.getClass(), "totalPoint", 2887655543704591231L);
        setIntField(term3179668, term3179668.getClass(), "playCount", 1147628786);
        setIntField(term3179668, term3179668.getClass(), "jewelCount", -1847930401);
        setIntField(term3179668, term3179668.getClass(), "totalJewelCount", 1538286052);
        setIntField(term3179668, term3179668.getClass(), "medalCount", 907216503);
        setIntField(term3179668, term3179668.getClass(), "playerRating", 2020883522);
        setIntField(term3179668, term3179668.getClass(), "highestRating", -1826032457);
        setIntField(term3179668, term3179668.getClass(), "battlePoint", 292693170);
        setIntField(term3179668, term3179668.getClass(), "bestBattlePoint", 981539311);
        setIntField(term3179668, term3179668.getClass(), "overDamageBattlePoint", -1727648791);
        setIntField(term3179668, term3179668.getClass(), "nameplateId", 1456941318);
        setIntField(term3179668, term3179668.getClass(), "trophyId", 394373510);
        setIntField(term3179668, term3179668.getClass(), "cardId", -800112704);
        setIntField(term3179668, term3179668.getClass(), "characterId", -335890328);
        setIntField(term3179668, term3179668.getClass(), "tabSetting", -280666493);
        setIntField(term3179668, term3179668.getClass(), "tabSortSetting", 477987746);
        setIntField(term3179668, term3179668.getClass(), "cardCategorySetting", -543204692);
        setIntField(term3179668, term3179668.getClass(), "cardSortSetting", -1209897090);
        setIntField(term3179668, term3179668.getClass(), "rivalScoreCategorySetting", 2068616893);
        setIntField(term3179668, term3179668.getClass(), "playedTutorialBit", -1136993242);
        setIntField(term3179668, term3179668.getClass(), "firstTutorialCancelNum", 69611743);
        setLongField(term3179668, term3179668.getClass(), "sumTechHighScore", -3936004029916808393L);
        setLongField(term3179668, term3179668.getClass(), "sumTechBasicHighScore", -9008634879947789569L);
        setLongField(term3179668, term3179668.getClass(), "sumTechAdvancedHighScore", 1483040402283193902L);
        setLongField(term3179668, term3179668.getClass(), "sumTechExpertHighScore", 5474747178215203999L);
        setLongField(term3179668, term3179668.getClass(), "sumTechMasterHighScore", -378531898384321530L);
        setLongField(term3179668, term3179668.getClass(), "sumTechLunaticHighScore", -5489484637064919135L);
        setLongField(term3179668, term3179668.getClass(), "sumBattleHighScore", -5786256636941949498L);
        setLongField(term3179668, term3179668.getClass(), "sumBattleBasicHighScore", 1627097395948046171L);
        setLongField(term3179668, term3179668.getClass(), "sumBattleAdvancedHighScore", 5188181963712291650L);
        setLongField(term3179668, term3179668.getClass(), "sumBattleExpertHighScore", -7249286641213665222L);
        setLongField(term3179668, term3179668.getClass(), "sumBattleMasterHighScore", 576600355340415427L);
        setLongField(term3179668, term3179668.getClass(), "sumBattleLunaticHighScore", -4202356650297648887L);
        setField(term3179668, term3179668.getClass(), "eventWatchedDate", "UdATGpETEJ");
        setField(term3179668, term3179668.getClass(), "cmEventWatchedDate", "DGHpBxGyUG");
        setField(term3179668, term3179668.getClass(), "firstGameId", "bpIoAyVxfq");
        setField(term3179668, term3179668.getClass(), "firstRomVersion", "ctvYADbaEU");
        setField(term3179668, term3179668.getClass(), "firstDataVersion", "gXTorDjlBb");
        setField(term3179668, term3179668.getClass(), "firstPlayDate", "CARAPXsbqZ");
        setField(term3179668, term3179668.getClass(), "lastGameId", "TpUsAZOsmr");
        setField(term3179668, term3179668.getClass(), "lastRomVersion", "vlVeJUjWJY");
        setField(term3179668, term3179668.getClass(), "lastDataVersion", "CeEMykEIPb");
        setField(term3179668, term3179668.getClass(), "compatibleCmVersion", "zdjsrvurJx");
        setField(term3179668, term3179668.getClass(), "lastPlayDate", "ggXIGsOYKR");
        setIntField(term3179668, term3179668.getClass(), "lastPlaceId", 1466162161);
        setField(term3179668, term3179668.getClass(), "lastPlaceName", "pVlDGTcSPV");
        setIntField(term3179668, term3179668.getClass(), "lastRegionId", -1746968685);
        setField(term3179668, term3179668.getClass(), "lastRegionName", "bBZcRRoWKv");
        setIntField(term3179668, term3179668.getClass(), "lastAllNetId", -1978806932);
        setField(term3179668, term3179668.getClass(), "lastClientId", "eLDIboYDlP");
        setIntField(term3179668, term3179668.getClass(), "lastUsedDeckId", -398054008);
        setIntField(term3179668, term3179668.getClass(), "lastPlayMusicLevel", -637867635);
        setIntField(term3179668, term3179668.getClass(), "lastEmoneyBrand", 1897070825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleMasterHighScore", argTypes, term3179668, args);
    }

};


