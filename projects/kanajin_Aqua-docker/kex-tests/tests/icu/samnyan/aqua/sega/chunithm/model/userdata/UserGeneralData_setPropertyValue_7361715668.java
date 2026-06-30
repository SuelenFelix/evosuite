package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGeneralData_setPropertyValue_7361715668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306721;

    public UserGeneralData_setPropertyValue_7361715668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term306727 = new Long(4947643967691976731L);
        term306721 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term306723 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term306725 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term306741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306834 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306835 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306839 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306933 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term306721, term306721.getClass(), "id", 6052534560716480370L);
        setLongField(term306723, term306723.getClass(), "id", 2175456273310844514L);
        setLongField(term306725, term306725.getClass(), "id", -1600316146749079952L);
        setField(term306725, term306725.getClass(), "extId", term306727);
        setField(term306725, term306725.getClass(), "luid", "SInylFGlyL");
        setIntField(term306742, term306742.getClass(), "year", 2014);
        setShortField(term306742, term306742.getClass(), "month", (short) 3);
        setShortField(term306742, term306742.getClass(), "day", (short) 24);
        setField(term306741, term306741.getClass(), "date", term306742);
        setByteField(term306746, term306746.getClass(), "hour", (byte) 13);
        setByteField(term306746, term306746.getClass(), "minute", (byte) 49);
        setByteField(term306746, term306746.getClass(), "second", (byte) 57);
        setIntField(term306746, term306746.getClass(), "nano", 639464686);
        setField(term306741, term306741.getClass(), "time", term306746);
        setField(term306725, term306725.getClass(), "registerTime", term306741);
        setIntField(term306752, term306752.getClass(), "year", 2014);
        setShortField(term306752, term306752.getClass(), "month", (short) 3);
        setShortField(term306752, term306752.getClass(), "day", (short) 28);
        setField(term306751, term306751.getClass(), "date", term306752);
        setByteField(term306756, term306756.getClass(), "hour", (byte) 0);
        setByteField(term306756, term306756.getClass(), "minute", (byte) 0);
        setByteField(term306756, term306756.getClass(), "second", (byte) 7);
        setIntField(term306756, term306756.getClass(), "nano", 445082256);
        setField(term306751, term306751.getClass(), "time", term306756);
        setField(term306725, term306725.getClass(), "accessTime", term306751);
        setField(term306723, term306723.getClass(), "card", term306725);
        setField(term306723, term306723.getClass(), "userName", "vTqdPzKttw");
        setIntField(term306774, term306774.getClass(), "year", 2025);
        setShortField(term306774, term306774.getClass(), "month", (short) 11);
        setShortField(term306774, term306774.getClass(), "day", (short) 30);
        setField(term306773, term306773.getClass(), "date", term306774);
        setByteField(term306778, term306778.getClass(), "hour", (byte) 5);
        setByteField(term306778, term306778.getClass(), "minute", (byte) 47);
        setByteField(term306778, term306778.getClass(), "second", (byte) 15);
        setIntField(term306778, term306778.getClass(), "nano", 123820485);
        setField(term306773, term306773.getClass(), "time", term306778);
        setField(term306723, term306723.getClass(), "lastLoginDate", term306773);
        setBooleanField(term306723, term306723.getClass(), "isWebJoin", true);
        setField(term306723, term306723.getClass(), "webLimitDate", "UaULhxzYkE");
        setIntField(term306723, term306723.getClass(), "level", -1259199493);
        setIntField(term306723, term306723.getClass(), "reincarnationNum", 1451218402);
        setField(term306723, term306723.getClass(), "exp", "DkwiMryAQU");
        setLongField(term306723, term306723.getClass(), "point", 7337716616309286243L);
        setLongField(term306723, term306723.getClass(), "totalPoint", -6634067216088918181L);
        setIntField(term306723, term306723.getClass(), "playCount", -854091061);
        setIntField(term306723, term306723.getClass(), "multiPlayCount", 744569990);
        setIntField(term306723, term306723.getClass(), "multiWinCount", -2070422454);
        setIntField(term306723, term306723.getClass(), "requestResCount", 1588346817);
        setIntField(term306723, term306723.getClass(), "acceptResCount", 398234886);
        setIntField(term306723, term306723.getClass(), "successResCount", -563567351);
        setIntField(term306723, term306723.getClass(), "playerRating", 682029949);
        setIntField(term306723, term306723.getClass(), "highestRating", -1663944520);
        setIntField(term306723, term306723.getClass(), "nameplateId", 724138196);
        setIntField(term306723, term306723.getClass(), "frameId", -147066224);
        setIntField(term306723, term306723.getClass(), "characterId", -509514471);
        setIntField(term306723, term306723.getClass(), "trophyId", -1949091735);
        setIntField(term306723, term306723.getClass(), "playedTutorialBit", -1133615279);
        setIntField(term306723, term306723.getClass(), "firstTutorialCancelNum", 626847753);
        setIntField(term306723, term306723.getClass(), "masterTutorialCancelNum", 1969584554);
        setIntField(term306723, term306723.getClass(), "totalRepertoireCount", 710954100);
        setIntField(term306723, term306723.getClass(), "totalMapNum", 2101628029);
        setLongField(term306723, term306723.getClass(), "totalHiScore", 1329799884512173819L);
        setLongField(term306723, term306723.getClass(), "totalBasicHighScore", 934727387934758977L);
        setLongField(term306723, term306723.getClass(), "totalAdvancedHighScore", -5846231543152567484L);
        setLongField(term306723, term306723.getClass(), "totalExpertHighScore", -4970443285956760514L);
        setLongField(term306723, term306723.getClass(), "totalMasterHighScore", -4473773331877810049L);
        setIntField(term306835, term306835.getClass(), "year", 2029);
        setShortField(term306835, term306835.getClass(), "month", (short) 8);
        setShortField(term306835, term306835.getClass(), "day", (short) 11);
        setField(term306834, term306834.getClass(), "date", term306835);
        setByteField(term306839, term306839.getClass(), "hour", (byte) 10);
        setByteField(term306839, term306839.getClass(), "minute", (byte) 43);
        setByteField(term306839, term306839.getClass(), "second", (byte) 53);
        setIntField(term306839, term306839.getClass(), "nano", 769993128);
        setField(term306834, term306834.getClass(), "time", term306839);
        setField(term306723, term306723.getClass(), "eventWatchedDate", term306834);
        setIntField(term306723, term306723.getClass(), "friendCount", -846852041);
        setBooleanField(term306723, term306723.getClass(), "isMaimai", true);
        setField(term306723, term306723.getClass(), "firstGameId", "mVdlxSSqUp");
        setField(term306723, term306723.getClass(), "firstRomVersion", "uLrjpWhGzA");
        setField(term306723, term306723.getClass(), "firstDataVersion", "vwfIkOlVZd");
        setIntField(term306883, term306883.getClass(), "year", 2011);
        setShortField(term306883, term306883.getClass(), "month", (short) 1);
        setShortField(term306883, term306883.getClass(), "day", (short) 29);
        setField(term306882, term306882.getClass(), "date", term306883);
        setByteField(term306887, term306887.getClass(), "hour", (byte) 6);
        setByteField(term306887, term306887.getClass(), "minute", (byte) 54);
        setByteField(term306887, term306887.getClass(), "second", (byte) 26);
        setIntField(term306887, term306887.getClass(), "nano", 322163824);
        setField(term306882, term306882.getClass(), "time", term306887);
        setField(term306723, term306723.getClass(), "firstPlayDate", term306882);
        setField(term306723, term306723.getClass(), "lastGameId", "MceqIBCmbY");
        setField(term306723, term306723.getClass(), "lastRomVersion", "rlUBuxBZan");
        setField(term306723, term306723.getClass(), "lastDataVersion", "xcfVTYHLJQ");
        setIntField(term306929, term306929.getClass(), "year", 2021);
        setShortField(term306929, term306929.getClass(), "month", (short) 4);
        setShortField(term306929, term306929.getClass(), "day", (short) 3);
        setField(term306928, term306928.getClass(), "date", term306929);
        setByteField(term306933, term306933.getClass(), "hour", (byte) 17);
        setByteField(term306933, term306933.getClass(), "minute", (byte) 36);
        setByteField(term306933, term306933.getClass(), "second", (byte) 22);
        setIntField(term306933, term306933.getClass(), "nano", 111541951);
        setField(term306928, term306928.getClass(), "time", term306933);
        setField(term306723, term306723.getClass(), "lastPlayDate", term306928);
        setIntField(term306723, term306723.getClass(), "lastPlaceId", 215045898);
        setField(term306723, term306723.getClass(), "lastPlaceName", "pcqiKdOHBV");
        setField(term306723, term306723.getClass(), "lastRegionId", "rXuZuSwWYH");
        setField(term306723, term306723.getClass(), "lastRegionName", "dxRMTzPEIm");
        setField(term306723, term306723.getClass(), "lastAllNetId", "HXmJcdlvRm");
        setField(term306723, term306723.getClass(), "lastClientId", "SIFtikilxs");
        setField(term306721, term306721.getClass(), "user", term306723);
        setField(term306721, term306721.getClass(), "propertyKey", "DMJMXIbDkU");
        setField(term306721, term306721.getClass(), "propertyValue", "kmMUYIoNgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PfONuRjuSj";
        callMethod(klass, "setPropertyValue", argTypes, term306721, args);
    }

};


