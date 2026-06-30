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

public class UserGameOptionEx_getExt7_8944036259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313615;

    public UserGameOptionEx_getExt7_8944036259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term313621 = new Long(-5850316381591949820L);
        term313615 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term313617 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term313619 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term313635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313640 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313650 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313672 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313733 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313781 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313827 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term313615, term313615.getClass(), "id", -180416108590927510L);
        setLongField(term313617, term313617.getClass(), "id", -5591666700101099024L);
        setLongField(term313619, term313619.getClass(), "id", 5802126062780266371L);
        setField(term313619, term313619.getClass(), "extId", term313621);
        setField(term313619, term313619.getClass(), "luid", "fzMkBxNUHB");
        setIntField(term313636, term313636.getClass(), "year", 2012);
        setShortField(term313636, term313636.getClass(), "month", (short) 7);
        setShortField(term313636, term313636.getClass(), "day", (short) 11);
        setField(term313635, term313635.getClass(), "date", term313636);
        setByteField(term313640, term313640.getClass(), "hour", (byte) 11);
        setByteField(term313640, term313640.getClass(), "minute", (byte) 51);
        setByteField(term313640, term313640.getClass(), "second", (byte) 23);
        setIntField(term313640, term313640.getClass(), "nano", 281280231);
        setField(term313635, term313635.getClass(), "time", term313640);
        setField(term313619, term313619.getClass(), "registerTime", term313635);
        setIntField(term313646, term313646.getClass(), "year", 2023);
        setShortField(term313646, term313646.getClass(), "month", (short) 6);
        setShortField(term313646, term313646.getClass(), "day", (short) 19);
        setField(term313645, term313645.getClass(), "date", term313646);
        setByteField(term313650, term313650.getClass(), "hour", (byte) 2);
        setByteField(term313650, term313650.getClass(), "minute", (byte) 29);
        setByteField(term313650, term313650.getClass(), "second", (byte) 26);
        setIntField(term313650, term313650.getClass(), "nano", 733555997);
        setField(term313645, term313645.getClass(), "time", term313650);
        setField(term313619, term313619.getClass(), "accessTime", term313645);
        setField(term313617, term313617.getClass(), "card", term313619);
        setField(term313617, term313617.getClass(), "userName", "qzVIBCSTKC");
        setIntField(term313668, term313668.getClass(), "year", 2026);
        setShortField(term313668, term313668.getClass(), "month", (short) 7);
        setShortField(term313668, term313668.getClass(), "day", (short) 25);
        setField(term313667, term313667.getClass(), "date", term313668);
        setByteField(term313672, term313672.getClass(), "hour", (byte) 8);
        setByteField(term313672, term313672.getClass(), "minute", (byte) 13);
        setByteField(term313672, term313672.getClass(), "second", (byte) 4);
        setIntField(term313672, term313672.getClass(), "nano", 892409523);
        setField(term313667, term313667.getClass(), "time", term313672);
        setField(term313617, term313617.getClass(), "lastLoginDate", term313667);
        setBooleanField(term313617, term313617.getClass(), "isWebJoin", true);
        setField(term313617, term313617.getClass(), "webLimitDate", "ITnfwxpCsl");
        setIntField(term313617, term313617.getClass(), "level", 955798298);
        setIntField(term313617, term313617.getClass(), "reincarnationNum", -515709669);
        setField(term313617, term313617.getClass(), "exp", "KZCgNQgPRl");
        setLongField(term313617, term313617.getClass(), "point", 8916610383825200327L);
        setLongField(term313617, term313617.getClass(), "totalPoint", -3797656198625801846L);
        setIntField(term313617, term313617.getClass(), "playCount", 1070770536);
        setIntField(term313617, term313617.getClass(), "multiPlayCount", -800262090);
        setIntField(term313617, term313617.getClass(), "multiWinCount", 37661005);
        setIntField(term313617, term313617.getClass(), "requestResCount", -554614529);
        setIntField(term313617, term313617.getClass(), "acceptResCount", -749088802);
        setIntField(term313617, term313617.getClass(), "successResCount", 865892919);
        setIntField(term313617, term313617.getClass(), "playerRating", -1867391923);
        setIntField(term313617, term313617.getClass(), "highestRating", -876106068);
        setIntField(term313617, term313617.getClass(), "nameplateId", -789809110);
        setIntField(term313617, term313617.getClass(), "frameId", 1509606879);
        setIntField(term313617, term313617.getClass(), "characterId", 514418591);
        setIntField(term313617, term313617.getClass(), "trophyId", -1594708942);
        setIntField(term313617, term313617.getClass(), "playedTutorialBit", -1449719534);
        setIntField(term313617, term313617.getClass(), "firstTutorialCancelNum", 768974922);
        setIntField(term313617, term313617.getClass(), "masterTutorialCancelNum", -316493673);
        setIntField(term313617, term313617.getClass(), "totalRepertoireCount", 50899844);
        setIntField(term313617, term313617.getClass(), "totalMapNum", 26006285);
        setLongField(term313617, term313617.getClass(), "totalHiScore", 2193982667821200359L);
        setLongField(term313617, term313617.getClass(), "totalBasicHighScore", -4225168292049445660L);
        setLongField(term313617, term313617.getClass(), "totalAdvancedHighScore", 6662557842491889405L);
        setLongField(term313617, term313617.getClass(), "totalExpertHighScore", -5802097793900081339L);
        setLongField(term313617, term313617.getClass(), "totalMasterHighScore", -4896356265370003983L);
        setIntField(term313729, term313729.getClass(), "year", 2018);
        setShortField(term313729, term313729.getClass(), "month", (short) 8);
        setShortField(term313729, term313729.getClass(), "day", (short) 18);
        setField(term313728, term313728.getClass(), "date", term313729);
        setByteField(term313733, term313733.getClass(), "hour", (byte) 11);
        setByteField(term313733, term313733.getClass(), "minute", (byte) 6);
        setByteField(term313733, term313733.getClass(), "second", (byte) 41);
        setIntField(term313733, term313733.getClass(), "nano", 471901949);
        setField(term313728, term313728.getClass(), "time", term313733);
        setField(term313617, term313617.getClass(), "eventWatchedDate", term313728);
        setIntField(term313617, term313617.getClass(), "friendCount", -30490190);
        setBooleanField(term313617, term313617.getClass(), "isMaimai", false);
        setField(term313617, term313617.getClass(), "firstGameId", "cRXtToSuNf");
        setField(term313617, term313617.getClass(), "firstRomVersion", "EGhoDGUsdp");
        setField(term313617, term313617.getClass(), "firstDataVersion", "bpCsiZxavU");
        setIntField(term313777, term313777.getClass(), "year", 2016);
        setShortField(term313777, term313777.getClass(), "month", (short) 8);
        setShortField(term313777, term313777.getClass(), "day", (short) 20);
        setField(term313776, term313776.getClass(), "date", term313777);
        setByteField(term313781, term313781.getClass(), "hour", (byte) 23);
        setByteField(term313781, term313781.getClass(), "minute", (byte) 27);
        setByteField(term313781, term313781.getClass(), "second", (byte) 21);
        setIntField(term313781, term313781.getClass(), "nano", 519177396);
        setField(term313776, term313776.getClass(), "time", term313781);
        setField(term313617, term313617.getClass(), "firstPlayDate", term313776);
        setField(term313617, term313617.getClass(), "lastGameId", "GkQIPePZVq");
        setField(term313617, term313617.getClass(), "lastRomVersion", "sNCvwCZLFy");
        setField(term313617, term313617.getClass(), "lastDataVersion", "ntVwFBVYrW");
        setIntField(term313823, term313823.getClass(), "year", 2012);
        setShortField(term313823, term313823.getClass(), "month", (short) 10);
        setShortField(term313823, term313823.getClass(), "day", (short) 12);
        setField(term313822, term313822.getClass(), "date", term313823);
        setByteField(term313827, term313827.getClass(), "hour", (byte) 9);
        setByteField(term313827, term313827.getClass(), "minute", (byte) 49);
        setByteField(term313827, term313827.getClass(), "second", (byte) 56);
        setIntField(term313827, term313827.getClass(), "nano", 320687503);
        setField(term313822, term313822.getClass(), "time", term313827);
        setField(term313617, term313617.getClass(), "lastPlayDate", term313822);
        setIntField(term313617, term313617.getClass(), "lastPlaceId", -1746285079);
        setField(term313617, term313617.getClass(), "lastPlaceName", "HlALosrXEr");
        setField(term313617, term313617.getClass(), "lastRegionId", "qOjvdcWKrI");
        setField(term313617, term313617.getClass(), "lastRegionName", "XBGzXdRVOP");
        setField(term313617, term313617.getClass(), "lastAllNetId", "vdgGisWgKr");
        setField(term313617, term313617.getClass(), "lastClientId", "zARCfPQBXQ");
        setField(term313615, term313615.getClass(), "user", term313617);
        setIntField(term313615, term313615.getClass(), "ext1", 254149756);
        setIntField(term313615, term313615.getClass(), "ext2", -1272073230);
        setIntField(term313615, term313615.getClass(), "ext3", 1208369428);
        setIntField(term313615, term313615.getClass(), "ext4", -405883777);
        setIntField(term313615, term313615.getClass(), "ext5", -850951391);
        setIntField(term313615, term313615.getClass(), "ext6", -15351310);
        setIntField(term313615, term313615.getClass(), "ext7", 1351456274);
        setIntField(term313615, term313615.getClass(), "ext8", -1002447476);
        setIntField(term313615, term313615.getClass(), "ext9", 1925781036);
        setIntField(term313615, term313615.getClass(), "ext10", -58183224);
        setIntField(term313615, term313615.getClass(), "ext11", -1620159206);
        setIntField(term313615, term313615.getClass(), "ext12", 2040576480);
        setIntField(term313615, term313615.getClass(), "ext13", 708993481);
        setIntField(term313615, term313615.getClass(), "ext14", 753265710);
        setIntField(term313615, term313615.getClass(), "ext15", 1870531016);
        setIntField(term313615, term313615.getClass(), "ext16", 1480820350);
        setIntField(term313615, term313615.getClass(), "ext17", -1991034214);
        setIntField(term313615, term313615.getClass(), "ext18", 888374930);
        setIntField(term313615, term313615.getClass(), "ext19", -303377527);
        setIntField(term313615, term313615.getClass(), "ext20", 1314084459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt7", argTypes, term313615, args);
    }

};


