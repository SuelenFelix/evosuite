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

public class UserData_getFirstRomVersion_38622689145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40953;

    public UserData_getFirstRomVersion_38622689145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40957 = new Long(3133860696238261492L);
        term40953 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term40955 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term40971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40986 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term40953, term40953.getClass(), "id", -1751226545925422063L);
        setLongField(term40955, term40955.getClass(), "id", 8004140060064605966L);
        setField(term40955, term40955.getClass(), "extId", term40957);
        setField(term40955, term40955.getClass(), "luid", "uMzGGnJFYF");
        setIntField(term40972, term40972.getClass(), "year", 2020);
        setShortField(term40972, term40972.getClass(), "month", (short) 12);
        setShortField(term40972, term40972.getClass(), "day", (short) 30);
        setField(term40971, term40971.getClass(), "date", term40972);
        setByteField(term40976, term40976.getClass(), "hour", (byte) 2);
        setByteField(term40976, term40976.getClass(), "minute", (byte) 11);
        setByteField(term40976, term40976.getClass(), "second", (byte) 8);
        setIntField(term40976, term40976.getClass(), "nano", 528799251);
        setField(term40971, term40971.getClass(), "time", term40976);
        setField(term40955, term40955.getClass(), "registerTime", term40971);
        setIntField(term40982, term40982.getClass(), "year", 2027);
        setShortField(term40982, term40982.getClass(), "month", (short) 9);
        setShortField(term40982, term40982.getClass(), "day", (short) 29);
        setField(term40981, term40981.getClass(), "date", term40982);
        setByteField(term40986, term40986.getClass(), "hour", (byte) 19);
        setByteField(term40986, term40986.getClass(), "minute", (byte) 13);
        setByteField(term40986, term40986.getClass(), "second", (byte) 31);
        setIntField(term40986, term40986.getClass(), "nano", 854066575);
        setField(term40981, term40981.getClass(), "time", term40986);
        setField(term40955, term40955.getClass(), "accessTime", term40981);
        setField(term40953, term40953.getClass(), "card", term40955);
        setField(term40953, term40953.getClass(), "userName", "iAIRLRjFkP");
        setIntField(term40953, term40953.getClass(), "level", 1630959866);
        setIntField(term40953, term40953.getClass(), "reincarnationNum", 414147550);
        setLongField(term40953, term40953.getClass(), "exp", 5918878276163368150L);
        setLongField(term40953, term40953.getClass(), "point", -7624173005251704961L);
        setLongField(term40953, term40953.getClass(), "totalPoint", 2044380118626071125L);
        setIntField(term40953, term40953.getClass(), "playCount", 1652909222);
        setIntField(term40953, term40953.getClass(), "jewelCount", 1130098561);
        setIntField(term40953, term40953.getClass(), "totalJewelCount", 954169543);
        setIntField(term40953, term40953.getClass(), "medalCount", -2124307939);
        setIntField(term40953, term40953.getClass(), "playerRating", 332880714);
        setIntField(term40953, term40953.getClass(), "highestRating", 904733719);
        setIntField(term40953, term40953.getClass(), "battlePoint", -240576356);
        setIntField(term40953, term40953.getClass(), "bestBattlePoint", 148921829);
        setIntField(term40953, term40953.getClass(), "overDamageBattlePoint", 2076458515);
        setBooleanField(term40953, term40953.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term40953, term40953.getClass(), "nameplateId", 622248745);
        setIntField(term40953, term40953.getClass(), "trophyId", -33243170);
        setIntField(term40953, term40953.getClass(), "cardId", -906823990);
        setIntField(term40953, term40953.getClass(), "characterId", -1670324779);
        setIntField(term40953, term40953.getClass(), "characterVoiceNo", -1696838199);
        setIntField(term40953, term40953.getClass(), "tabSetting", -1286086755);
        setIntField(term40953, term40953.getClass(), "tabSortSetting", 724669093);
        setIntField(term40953, term40953.getClass(), "cardCategorySetting", -2005743628);
        setIntField(term40953, term40953.getClass(), "cardSortSetting", -1204207224);
        setIntField(term40953, term40953.getClass(), "rivalScoreCategorySetting", -77932500);
        setIntField(term40953, term40953.getClass(), "playedTutorialBit", -1558194793);
        setIntField(term40953, term40953.getClass(), "firstTutorialCancelNum", -13354986);
        setLongField(term40953, term40953.getClass(), "sumTechHighScore", -8364623164355526163L);
        setLongField(term40953, term40953.getClass(), "sumTechBasicHighScore", -4293853358216323773L);
        setLongField(term40953, term40953.getClass(), "sumTechAdvancedHighScore", -474245812336702069L);
        setLongField(term40953, term40953.getClass(), "sumTechExpertHighScore", -3005158994986938727L);
        setLongField(term40953, term40953.getClass(), "sumTechMasterHighScore", -7175762262426771446L);
        setLongField(term40953, term40953.getClass(), "sumTechLunaticHighScore", 337617062500822936L);
        setLongField(term40953, term40953.getClass(), "sumBattleHighScore", -6622023497681653956L);
        setLongField(term40953, term40953.getClass(), "sumBattleBasicHighScore", -6753978337878946291L);
        setLongField(term40953, term40953.getClass(), "sumBattleAdvancedHighScore", -6937950410603484933L);
        setLongField(term40953, term40953.getClass(), "sumBattleExpertHighScore", 4560845347692916950L);
        setLongField(term40953, term40953.getClass(), "sumBattleMasterHighScore", 310539009137263944L);
        setLongField(term40953, term40953.getClass(), "sumBattleLunaticHighScore", 2625120506837282980L);
        setField(term40953, term40953.getClass(), "eventWatchedDate", "cdXvvxXVTz");
        setField(term40953, term40953.getClass(), "cmEventWatchedDate", "tXsfWIqIPn");
        setField(term40953, term40953.getClass(), "firstGameId", "tDmfqEyHaN");
        setField(term40953, term40953.getClass(), "firstRomVersion", "mTSMXFkWRr");
        setField(term40953, term40953.getClass(), "firstDataVersion", "qdIiMKwfzT");
        setField(term40953, term40953.getClass(), "firstPlayDate", "qrmUWIxufo");
        setField(term40953, term40953.getClass(), "lastGameId", "SeWCUkXfZv");
        setField(term40953, term40953.getClass(), "lastRomVersion", "woQcQRYwNH");
        setField(term40953, term40953.getClass(), "lastDataVersion", "uQjzusifTg");
        setField(term40953, term40953.getClass(), "compatibleCmVersion", "mOulGkUjOk");
        setField(term40953, term40953.getClass(), "lastPlayDate", "hNWRuNEgOf");
        setIntField(term40953, term40953.getClass(), "lastPlaceId", -2134459880);
        setField(term40953, term40953.getClass(), "lastPlaceName", "CEtjGBplmv");
        setIntField(term40953, term40953.getClass(), "lastRegionId", -1811405838);
        setField(term40953, term40953.getClass(), "lastRegionName", "XosDTAzIAT");
        setIntField(term40953, term40953.getClass(), "lastAllNetId", 619484749);
        setField(term40953, term40953.getClass(), "lastClientId", "lcCEhCpiZM");
        setIntField(term40953, term40953.getClass(), "lastUsedDeckId", 490271003);
        setIntField(term40953, term40953.getClass(), "lastPlayMusicLevel", 1541867826);
        setIntField(term40953, term40953.getClass(), "lastEmoneyBrand", -137176190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term40953, args);
    }

};


