package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMusicItem_init_4303679090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserMusicItem_init_4303679090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term3 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setLongField(term3, term3.getClass(), "id", 6375119433582206027L);
        setField(term3, term3.getClass(), "extId", term5);
        setField(term3, term3.getClass(), "luid", "PAEBtnZtTD");
        setIntField(term20, term20.getClass(), "year", 2012);
        setShortField(term20, term20.getClass(), "month", (short) 8);
        setShortField(term20, term20.getClass(), "day", (short) 25);
        setField(term19, term19.getClass(), "date", term20);
        setByteField(term24, term24.getClass(), "hour", (byte) 5);
        setByteField(term24, term24.getClass(), "minute", (byte) 20);
        setByteField(term24, term24.getClass(), "second", (byte) 50);
        setIntField(term24, term24.getClass(), "nano", 345595912);
        setField(term19, term19.getClass(), "time", term24);
        setField(term3, term3.getClass(), "registerTime", term19);
        setIntField(term30, term30.getClass(), "year", 2021);
        setShortField(term30, term30.getClass(), "month", (short) 1);
        setShortField(term30, term30.getClass(), "day", (short) 18);
        setField(term29, term29.getClass(), "date", term30);
        setByteField(term34, term34.getClass(), "hour", (byte) 13);
        setByteField(term34, term34.getClass(), "minute", (byte) 38);
        setByteField(term34, term34.getClass(), "second", (byte) 26);
        setIntField(term34, term34.getClass(), "nano", 544608644);
        setField(term29, term29.getClass(), "time", term34);
        setField(term3, term3.getClass(), "accessTime", term29);
        setField(term1, term1.getClass(), "card", term3);
        setField(term1, term1.getClass(), "userName", "sjlJAEtRrb");
        setIntField(term1, term1.getClass(), "level", 568599855);
        setIntField(term1, term1.getClass(), "reincarnationNum", 1162663216);
        setLongField(term1, term1.getClass(), "exp", -8257434502486459194L);
        setLongField(term1, term1.getClass(), "point", -8400487765614892086L);
        setLongField(term1, term1.getClass(), "totalPoint", 5270370404989704783L);
        setIntField(term1, term1.getClass(), "playCount", 1484323161);
        setIntField(term1, term1.getClass(), "jewelCount", 391863371);
        setIntField(term1, term1.getClass(), "totalJewelCount", -1922583790);
        setIntField(term1, term1.getClass(), "medalCount", -616727354);
        setIntField(term1, term1.getClass(), "playerRating", -1955890973);
        setIntField(term1, term1.getClass(), "highestRating", -2038273078);
        setIntField(term1, term1.getClass(), "battlePoint", 1227103734);
        setIntField(term1, term1.getClass(), "bestBattlePoint", -1339778481);
        setIntField(term1, term1.getClass(), "overDamageBattlePoint", 1725571209);
        setBooleanField(term1, term1.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term1, term1.getClass(), "nameplateId", -522618178);
        setIntField(term1, term1.getClass(), "trophyId", 1134449235);
        setIntField(term1, term1.getClass(), "cardId", -883034806);
        setIntField(term1, term1.getClass(), "characterId", 1585847225);
        setIntField(term1, term1.getClass(), "characterVoiceNo", 597278769);
        setIntField(term1, term1.getClass(), "tabSetting", -1685132342);
        setIntField(term1, term1.getClass(), "tabSortSetting", -1456670397);
        setIntField(term1, term1.getClass(), "cardCategorySetting", 1622346318);
        setIntField(term1, term1.getClass(), "cardSortSetting", 1048535127);
        setIntField(term1, term1.getClass(), "rivalScoreCategorySetting", -655067527);
        setIntField(term1, term1.getClass(), "playedTutorialBit", -6029667);
        setIntField(term1, term1.getClass(), "firstTutorialCancelNum", -2068769794);
        setLongField(term1, term1.getClass(), "sumTechHighScore", 7411271909051562686L);
        setLongField(term1, term1.getClass(), "sumTechBasicHighScore", 4872422362414183754L);
        setLongField(term1, term1.getClass(), "sumTechAdvancedHighScore", 6811161968424632369L);
        setLongField(term1, term1.getClass(), "sumTechExpertHighScore", -7237588299778557629L);
        setLongField(term1, term1.getClass(), "sumTechMasterHighScore", 6967924379644551255L);
        setLongField(term1, term1.getClass(), "sumTechLunaticHighScore", -2813493605142626659L);
        setLongField(term1, term1.getClass(), "sumBattleHighScore", -8885298608300233488L);
        setLongField(term1, term1.getClass(), "sumBattleBasicHighScore", -4325723315152823407L);
        setLongField(term1, term1.getClass(), "sumBattleAdvancedHighScore", 2535595959091595249L);
        setLongField(term1, term1.getClass(), "sumBattleExpertHighScore", -5476826692763582090L);
        setLongField(term1, term1.getClass(), "sumBattleMasterHighScore", -872011222785455006L);
        setLongField(term1, term1.getClass(), "sumBattleLunaticHighScore", -316468845751588286L);
        setField(term1, term1.getClass(), "eventWatchedDate", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "cmEventWatchedDate", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "firstGameId", "jJCZpVmanW");
        setField(term1, term1.getClass(), "firstRomVersion", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "firstDataVersion", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "firstPlayDate", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "lastGameId", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "lastRomVersion", "RMFIsYGgne");
        setField(term1, term1.getClass(), "lastDataVersion", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "compatibleCmVersion", "uuaPigETmJ");
        setField(term1, term1.getClass(), "lastPlayDate", "MxlszYVzRf");
        setIntField(term1, term1.getClass(), "lastPlaceId", -117576464);
        setField(term1, term1.getClass(), "lastPlaceName", "LQFpaHEwXR");
        setIntField(term1, term1.getClass(), "lastRegionId", -1007160944);
        setField(term1, term1.getClass(), "lastRegionName", "oVcInYnLWB");
        setIntField(term1, term1.getClass(), "lastAllNetId", 1135664017);
        setField(term1, term1.getClass(), "lastClientId", "aJlieCFVtF");
        setIntField(term1, term1.getClass(), "lastUsedDeckId", 590364439);
        setIntField(term1, term1.getClass(), "lastPlayMusicLevel", 865208305);
        setIntField(term1, term1.getClass(), "lastEmoneyBrand", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


