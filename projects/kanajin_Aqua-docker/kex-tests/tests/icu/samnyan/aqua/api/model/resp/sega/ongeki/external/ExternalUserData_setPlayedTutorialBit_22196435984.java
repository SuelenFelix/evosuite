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
import java.lang.Integer;

public class ExternalUserData_setPlayedTutorialBit_22196435984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129504;
     Object term129740;

    public ExternalUserData_setPlayedTutorialBit_22196435984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129504 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term129504, term129504.getClass(), "accessCode", "jWWzpOSZYQ");
        setField(term129504, term129504.getClass(), "userName", "EOnRdOrAGC");
        setIntField(term129504, term129504.getClass(), "level", 225881086);
        setIntField(term129504, term129504.getClass(), "reincarnationNum", -1596835098);
        setLongField(term129504, term129504.getClass(), "exp", 1008394459913225127L);
        setLongField(term129504, term129504.getClass(), "point", -8192741721460172933L);
        setLongField(term129504, term129504.getClass(), "totalPoint", 2793999343587038040L);
        setIntField(term129504, term129504.getClass(), "playCount", 60635888);
        setIntField(term129504, term129504.getClass(), "jewelCount", -414668199);
        setIntField(term129504, term129504.getClass(), "totalJewelCount", -1907824172);
        setIntField(term129504, term129504.getClass(), "medalCount", -1268639340);
        setIntField(term129504, term129504.getClass(), "playerRating", -353601453);
        setIntField(term129504, term129504.getClass(), "highestRating", 1384310426);
        setIntField(term129504, term129504.getClass(), "battlePoint", 1690570276);
        setIntField(term129504, term129504.getClass(), "bestBattlePoint", -442635413);
        setIntField(term129504, term129504.getClass(), "overDamageBattlePoint", -517367983);
        setIntField(term129504, term129504.getClass(), "nameplateId", 188890036);
        setIntField(term129504, term129504.getClass(), "trophyId", 1994730334);
        setIntField(term129504, term129504.getClass(), "cardId", -1231888970);
        setIntField(term129504, term129504.getClass(), "characterId", 1252722693);
        setIntField(term129504, term129504.getClass(), "tabSetting", 988192233);
        setIntField(term129504, term129504.getClass(), "tabSortSetting", -579945362);
        setIntField(term129504, term129504.getClass(), "cardCategorySetting", -179946459);
        setIntField(term129504, term129504.getClass(), "cardSortSetting", -1603538945);
        setIntField(term129504, term129504.getClass(), "rivalScoreCategorySetting", -461602218);
        setIntField(term129504, term129504.getClass(), "playedTutorialBit", -920631232);
        setIntField(term129504, term129504.getClass(), "firstTutorialCancelNum", -2030131194);
        setLongField(term129504, term129504.getClass(), "sumTechHighScore", 2019960798318927962L);
        setLongField(term129504, term129504.getClass(), "sumTechBasicHighScore", 5861238859322825086L);
        setLongField(term129504, term129504.getClass(), "sumTechAdvancedHighScore", 3277591499975533801L);
        setLongField(term129504, term129504.getClass(), "sumTechExpertHighScore", -3702955343376886749L);
        setLongField(term129504, term129504.getClass(), "sumTechMasterHighScore", 2055092005146691363L);
        setLongField(term129504, term129504.getClass(), "sumTechLunaticHighScore", 2538778056417326178L);
        setLongField(term129504, term129504.getClass(), "sumBattleHighScore", -2529355207629461416L);
        setLongField(term129504, term129504.getClass(), "sumBattleBasicHighScore", 2500592426173126917L);
        setLongField(term129504, term129504.getClass(), "sumBattleAdvancedHighScore", -7141324927836709257L);
        setLongField(term129504, term129504.getClass(), "sumBattleExpertHighScore", -3581891786673156241L);
        setLongField(term129504, term129504.getClass(), "sumBattleMasterHighScore", 7957779987363690895L);
        setLongField(term129504, term129504.getClass(), "sumBattleLunaticHighScore", -6872312190160437572L);
        setField(term129504, term129504.getClass(), "eventWatchedDate", "aAxtJdjhqn");
        setField(term129504, term129504.getClass(), "cmEventWatchedDate", "OLujSCDtXo");
        setField(term129504, term129504.getClass(), "firstGameId", "GoRjwJdAue");
        setField(term129504, term129504.getClass(), "firstRomVersion", "kXvhrilSNA");
        setField(term129504, term129504.getClass(), "firstDataVersion", "xHdahbrJMG");
        setField(term129504, term129504.getClass(), "firstPlayDate", "qUdSSUQJjt");
        setField(term129504, term129504.getClass(), "lastGameId", "jjONsLvlMf");
        setField(term129504, term129504.getClass(), "lastRomVersion", "lgQfPHMcgv");
        setField(term129504, term129504.getClass(), "lastDataVersion", "faRDhDaBEA");
        setField(term129504, term129504.getClass(), "compatibleCmVersion", "OEdRxYaZeh");
        setField(term129504, term129504.getClass(), "lastPlayDate", "LBqXFlsvHr");
        setIntField(term129504, term129504.getClass(), "lastPlaceId", -1044290712);
        setField(term129504, term129504.getClass(), "lastPlaceName", "CgIDMpLHUf");
        setIntField(term129504, term129504.getClass(), "lastRegionId", 1701612356);
        setField(term129504, term129504.getClass(), "lastRegionName", "jOvHaukwQE");
        setIntField(term129504, term129504.getClass(), "lastAllNetId", -674875002);
        setField(term129504, term129504.getClass(), "lastClientId", "vTwkkAbFRS");
        setIntField(term129504, term129504.getClass(), "lastUsedDeckId", -1131606349);
        setIntField(term129504, term129504.getClass(), "lastPlayMusicLevel", 801606762);
        setIntField(term129504, term129504.getClass(), "lastEmoneyBrand", -594991682);
        term129740 = new Integer(-855052616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term129740;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term129504, args);
    }

};


