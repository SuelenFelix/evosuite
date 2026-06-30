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
import java.lang.Integer;

public class UserGameOption_setSoundEffect_25361982230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62655;
     Object term62955;

    public UserGameOption_setSoundEffect_25361982230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62661 = new Long(1597484336218508869L);
        term62655 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term62657 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term62659 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term62675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62690 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62712 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62821 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62862 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62867 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term62655, term62655.getClass(), "id", 2458513029160061715L);
        setLongField(term62657, term62657.getClass(), "id", 8528564099162820842L);
        setLongField(term62659, term62659.getClass(), "id", -1931621459457925623L);
        setField(term62659, term62659.getClass(), "extId", term62661);
        setField(term62659, term62659.getClass(), "luid", "siRXAywvyp");
        setIntField(term62676, term62676.getClass(), "year", 2017);
        setShortField(term62676, term62676.getClass(), "month", (short) 7);
        setShortField(term62676, term62676.getClass(), "day", (short) 24);
        setField(term62675, term62675.getClass(), "date", term62676);
        setByteField(term62680, term62680.getClass(), "hour", (byte) 3);
        setByteField(term62680, term62680.getClass(), "minute", (byte) 55);
        setByteField(term62680, term62680.getClass(), "second", (byte) 40);
        setIntField(term62680, term62680.getClass(), "nano", 397924395);
        setField(term62675, term62675.getClass(), "time", term62680);
        setField(term62659, term62659.getClass(), "registerTime", term62675);
        setIntField(term62686, term62686.getClass(), "year", 2019);
        setShortField(term62686, term62686.getClass(), "month", (short) 1);
        setShortField(term62686, term62686.getClass(), "day", (short) 4);
        setField(term62685, term62685.getClass(), "date", term62686);
        setByteField(term62690, term62690.getClass(), "hour", (byte) 6);
        setByteField(term62690, term62690.getClass(), "minute", (byte) 53);
        setByteField(term62690, term62690.getClass(), "second", (byte) 23);
        setIntField(term62690, term62690.getClass(), "nano", 416630544);
        setField(term62685, term62685.getClass(), "time", term62690);
        setField(term62659, term62659.getClass(), "accessTime", term62685);
        setField(term62657, term62657.getClass(), "card", term62659);
        setField(term62657, term62657.getClass(), "userName", "ZRLaReQeFg");
        setIntField(term62708, term62708.getClass(), "year", 2021);
        setShortField(term62708, term62708.getClass(), "month", (short) 10);
        setShortField(term62708, term62708.getClass(), "day", (short) 12);
        setField(term62707, term62707.getClass(), "date", term62708);
        setByteField(term62712, term62712.getClass(), "hour", (byte) 10);
        setByteField(term62712, term62712.getClass(), "minute", (byte) 35);
        setByteField(term62712, term62712.getClass(), "second", (byte) 54);
        setIntField(term62712, term62712.getClass(), "nano", 943613873);
        setField(term62707, term62707.getClass(), "time", term62712);
        setField(term62657, term62657.getClass(), "lastLoginDate", term62707);
        setBooleanField(term62657, term62657.getClass(), "isWebJoin", false);
        setField(term62657, term62657.getClass(), "webLimitDate", "cOcXspUxKR");
        setIntField(term62657, term62657.getClass(), "level", 1415008678);
        setIntField(term62657, term62657.getClass(), "reincarnationNum", -768389527);
        setField(term62657, term62657.getClass(), "exp", "JNzgWUmqtl");
        setLongField(term62657, term62657.getClass(), "point", -947267660485940099L);
        setLongField(term62657, term62657.getClass(), "totalPoint", -1329447485805427573L);
        setIntField(term62657, term62657.getClass(), "playCount", 88636719);
        setIntField(term62657, term62657.getClass(), "multiPlayCount", -18572829);
        setIntField(term62657, term62657.getClass(), "multiWinCount", 1220825104);
        setIntField(term62657, term62657.getClass(), "requestResCount", -401847632);
        setIntField(term62657, term62657.getClass(), "acceptResCount", 1538271896);
        setIntField(term62657, term62657.getClass(), "successResCount", 840990489);
        setIntField(term62657, term62657.getClass(), "playerRating", -793012848);
        setIntField(term62657, term62657.getClass(), "highestRating", -2041331473);
        setIntField(term62657, term62657.getClass(), "nameplateId", -416355601);
        setIntField(term62657, term62657.getClass(), "frameId", 439309680);
        setIntField(term62657, term62657.getClass(), "characterId", -1717455505);
        setIntField(term62657, term62657.getClass(), "trophyId", 1898536358);
        setIntField(term62657, term62657.getClass(), "playedTutorialBit", 1296009499);
        setIntField(term62657, term62657.getClass(), "firstTutorialCancelNum", -427335137);
        setIntField(term62657, term62657.getClass(), "masterTutorialCancelNum", 9865038);
        setIntField(term62657, term62657.getClass(), "totalRepertoireCount", 1202401386);
        setIntField(term62657, term62657.getClass(), "totalMapNum", 1173310137);
        setLongField(term62657, term62657.getClass(), "totalHiScore", -2298075900308676256L);
        setLongField(term62657, term62657.getClass(), "totalBasicHighScore", -32504336313564415L);
        setLongField(term62657, term62657.getClass(), "totalAdvancedHighScore", -3072149709226785130L);
        setLongField(term62657, term62657.getClass(), "totalExpertHighScore", -539562950566320509L);
        setLongField(term62657, term62657.getClass(), "totalMasterHighScore", -6590502822258678292L);
        setIntField(term62769, term62769.getClass(), "year", 2014);
        setShortField(term62769, term62769.getClass(), "month", (short) 12);
        setShortField(term62769, term62769.getClass(), "day", (short) 24);
        setField(term62768, term62768.getClass(), "date", term62769);
        setByteField(term62773, term62773.getClass(), "hour", (byte) 14);
        setByteField(term62773, term62773.getClass(), "minute", (byte) 18);
        setByteField(term62773, term62773.getClass(), "second", (byte) 26);
        setIntField(term62773, term62773.getClass(), "nano", 945081214);
        setField(term62768, term62768.getClass(), "time", term62773);
        setField(term62657, term62657.getClass(), "eventWatchedDate", term62768);
        setIntField(term62657, term62657.getClass(), "friendCount", 957107652);
        setBooleanField(term62657, term62657.getClass(), "isMaimai", false);
        setField(term62657, term62657.getClass(), "firstGameId", "UxVfWaXiSr");
        setField(term62657, term62657.getClass(), "firstRomVersion", "yTrvklotrs");
        setField(term62657, term62657.getClass(), "firstDataVersion", "kNkFIdfwqs");
        setIntField(term62817, term62817.getClass(), "year", 2015);
        setShortField(term62817, term62817.getClass(), "month", (short) 6);
        setShortField(term62817, term62817.getClass(), "day", (short) 1);
        setField(term62816, term62816.getClass(), "date", term62817);
        setByteField(term62821, term62821.getClass(), "hour", (byte) 5);
        setByteField(term62821, term62821.getClass(), "minute", (byte) 44);
        setByteField(term62821, term62821.getClass(), "second", (byte) 48);
        setIntField(term62821, term62821.getClass(), "nano", 654356179);
        setField(term62816, term62816.getClass(), "time", term62821);
        setField(term62657, term62657.getClass(), "firstPlayDate", term62816);
        setField(term62657, term62657.getClass(), "lastGameId", "sHLdqoTjnP");
        setField(term62657, term62657.getClass(), "lastRomVersion", "UakuVGzEav");
        setField(term62657, term62657.getClass(), "lastDataVersion", "DxiwTTouEo");
        setIntField(term62863, term62863.getClass(), "year", 2027);
        setShortField(term62863, term62863.getClass(), "month", (short) 10);
        setShortField(term62863, term62863.getClass(), "day", (short) 12);
        setField(term62862, term62862.getClass(), "date", term62863);
        setByteField(term62867, term62867.getClass(), "hour", (byte) 16);
        setByteField(term62867, term62867.getClass(), "minute", (byte) 59);
        setByteField(term62867, term62867.getClass(), "second", (byte) 46);
        setIntField(term62867, term62867.getClass(), "nano", 525561936);
        setField(term62862, term62862.getClass(), "time", term62867);
        setField(term62657, term62657.getClass(), "lastPlayDate", term62862);
        setIntField(term62657, term62657.getClass(), "lastPlaceId", 292629613);
        setField(term62657, term62657.getClass(), "lastPlaceName", "ghoklPMuMt");
        setField(term62657, term62657.getClass(), "lastRegionId", "uAgfQbLPeZ");
        setField(term62657, term62657.getClass(), "lastRegionName", "aZiFZfzhQT");
        setField(term62657, term62657.getClass(), "lastAllNetId", "HbzAbCwWRh");
        setField(term62657, term62657.getClass(), "lastClientId", "yBgWgFtVxP");
        setField(term62655, term62655.getClass(), "user", term62657);
        setIntField(term62655, term62655.getClass(), "bgInfo", 1420755413);
        setIntField(term62655, term62655.getClass(), "fieldColor", -755973893);
        setIntField(term62655, term62655.getClass(), "guideSound", -890311309);
        setIntField(term62655, term62655.getClass(), "soundEffect", 2132845865);
        setIntField(term62655, term62655.getClass(), "guideLine", 1676055742);
        setIntField(term62655, term62655.getClass(), "speed", -963623987);
        setIntField(term62655, term62655.getClass(), "optionSet", 1184368914);
        setIntField(term62655, term62655.getClass(), "matching", 138525382);
        setIntField(term62655, term62655.getClass(), "judgePos", -1100331351);
        setIntField(term62655, term62655.getClass(), "rating", 1506966329);
        setIntField(term62655, term62655.getClass(), "judgeJustice", 38318819);
        setIntField(term62655, term62655.getClass(), "judgeAttack", 277037422);
        setIntField(term62655, term62655.getClass(), "headphone", -513227903);
        setIntField(term62655, term62655.getClass(), "playerLevel", -1834509557);
        setIntField(term62655, term62655.getClass(), "successTap", -1095760799);
        setIntField(term62655, term62655.getClass(), "successExTap", 964556409);
        setIntField(term62655, term62655.getClass(), "successSlideHold", 1651622020);
        setIntField(term62655, term62655.getClass(), "successAir", -1935395656);
        setIntField(term62655, term62655.getClass(), "successFlick", -530623408);
        setIntField(term62655, term62655.getClass(), "successSkill", 1949662959);
        setIntField(term62655, term62655.getClass(), "successTapTimbre", 1639772797);
        setIntField(term62655, term62655.getClass(), "privacy", -228932741);
        term62955 = new Integer(-134006257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term62955;
        callMethod(klass, "setSoundEffect", argTypes, term62655, args);
    }

};


