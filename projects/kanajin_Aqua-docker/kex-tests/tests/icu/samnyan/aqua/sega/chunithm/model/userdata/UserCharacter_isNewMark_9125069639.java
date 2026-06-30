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

public class UserCharacter_isNewMark_9125069639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111967;

    public UserCharacter_isNewMark_9125069639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111973 = new Long(860079646007397083L);
        term111967 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term111969 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term111971 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112002 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112019 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112020 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112024 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112085 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112128 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112129 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112133 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112179 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111967, term111967.getClass(), "id", -8904293163264570294L);
        setLongField(term111969, term111969.getClass(), "id", -9146144965408025864L);
        setLongField(term111971, term111971.getClass(), "id", -2955701716630821049L);
        setField(term111971, term111971.getClass(), "extId", term111973);
        setField(term111971, term111971.getClass(), "luid", "TAvUGVCPaa");
        setIntField(term111988, term111988.getClass(), "year", 2013);
        setShortField(term111988, term111988.getClass(), "month", (short) 8);
        setShortField(term111988, term111988.getClass(), "day", (short) 23);
        setField(term111987, term111987.getClass(), "date", term111988);
        setByteField(term111992, term111992.getClass(), "hour", (byte) 4);
        setByteField(term111992, term111992.getClass(), "minute", (byte) 50);
        setByteField(term111992, term111992.getClass(), "second", (byte) 59);
        setIntField(term111992, term111992.getClass(), "nano", 855943637);
        setField(term111987, term111987.getClass(), "time", term111992);
        setField(term111971, term111971.getClass(), "registerTime", term111987);
        setIntField(term111998, term111998.getClass(), "year", 2018);
        setShortField(term111998, term111998.getClass(), "month", (short) 6);
        setShortField(term111998, term111998.getClass(), "day", (short) 28);
        setField(term111997, term111997.getClass(), "date", term111998);
        setByteField(term112002, term112002.getClass(), "hour", (byte) 18);
        setByteField(term112002, term112002.getClass(), "minute", (byte) 0);
        setByteField(term112002, term112002.getClass(), "second", (byte) 57);
        setIntField(term112002, term112002.getClass(), "nano", 78069460);
        setField(term111997, term111997.getClass(), "time", term112002);
        setField(term111971, term111971.getClass(), "accessTime", term111997);
        setField(term111969, term111969.getClass(), "card", term111971);
        setField(term111969, term111969.getClass(), "userName", "oacMptGUKE");
        setIntField(term112020, term112020.getClass(), "year", 2025);
        setShortField(term112020, term112020.getClass(), "month", (short) 5);
        setShortField(term112020, term112020.getClass(), "day", (short) 13);
        setField(term112019, term112019.getClass(), "date", term112020);
        setByteField(term112024, term112024.getClass(), "hour", (byte) 19);
        setByteField(term112024, term112024.getClass(), "minute", (byte) 3);
        setByteField(term112024, term112024.getClass(), "second", (byte) 14);
        setIntField(term112024, term112024.getClass(), "nano", 805900693);
        setField(term112019, term112019.getClass(), "time", term112024);
        setField(term111969, term111969.getClass(), "lastLoginDate", term112019);
        setBooleanField(term111969, term111969.getClass(), "isWebJoin", true);
        setField(term111969, term111969.getClass(), "webLimitDate", "vjVwvYdNhl");
        setIntField(term111969, term111969.getClass(), "level", 547908690);
        setIntField(term111969, term111969.getClass(), "reincarnationNum", -378543345);
        setField(term111969, term111969.getClass(), "exp", "sqJqznmMco");
        setLongField(term111969, term111969.getClass(), "point", 8810510947864468259L);
        setLongField(term111969, term111969.getClass(), "totalPoint", 2653516526280557602L);
        setIntField(term111969, term111969.getClass(), "playCount", -2144696087);
        setIntField(term111969, term111969.getClass(), "multiPlayCount", -1629969931);
        setIntField(term111969, term111969.getClass(), "multiWinCount", -1274836853);
        setIntField(term111969, term111969.getClass(), "requestResCount", -757528574);
        setIntField(term111969, term111969.getClass(), "acceptResCount", 673141075);
        setIntField(term111969, term111969.getClass(), "successResCount", -1755544337);
        setIntField(term111969, term111969.getClass(), "playerRating", -1445578997);
        setIntField(term111969, term111969.getClass(), "highestRating", 830228887);
        setIntField(term111969, term111969.getClass(), "nameplateId", -903090832);
        setIntField(term111969, term111969.getClass(), "frameId", -1760776056);
        setIntField(term111969, term111969.getClass(), "characterId", 83069489);
        setIntField(term111969, term111969.getClass(), "trophyId", 2053017168);
        setIntField(term111969, term111969.getClass(), "playedTutorialBit", -1780206644);
        setIntField(term111969, term111969.getClass(), "firstTutorialCancelNum", 507003800);
        setIntField(term111969, term111969.getClass(), "masterTutorialCancelNum", 344294065);
        setIntField(term111969, term111969.getClass(), "totalRepertoireCount", 1193234010);
        setIntField(term111969, term111969.getClass(), "totalMapNum", 988470366);
        setLongField(term111969, term111969.getClass(), "totalHiScore", 562794068928395674L);
        setLongField(term111969, term111969.getClass(), "totalBasicHighScore", -2826036159687567411L);
        setLongField(term111969, term111969.getClass(), "totalAdvancedHighScore", -4457208393673096945L);
        setLongField(term111969, term111969.getClass(), "totalExpertHighScore", 6449000223758009356L);
        setLongField(term111969, term111969.getClass(), "totalMasterHighScore", -6691521986846521707L);
        setIntField(term112081, term112081.getClass(), "year", 2016);
        setShortField(term112081, term112081.getClass(), "month", (short) 1);
        setShortField(term112081, term112081.getClass(), "day", (short) 31);
        setField(term112080, term112080.getClass(), "date", term112081);
        setByteField(term112085, term112085.getClass(), "hour", (byte) 11);
        setByteField(term112085, term112085.getClass(), "minute", (byte) 50);
        setByteField(term112085, term112085.getClass(), "second", (byte) 49);
        setIntField(term112085, term112085.getClass(), "nano", 462330089);
        setField(term112080, term112080.getClass(), "time", term112085);
        setField(term111969, term111969.getClass(), "eventWatchedDate", term112080);
        setIntField(term111969, term111969.getClass(), "friendCount", -1015231314);
        setBooleanField(term111969, term111969.getClass(), "isMaimai", false);
        setField(term111969, term111969.getClass(), "firstGameId", "ZufWIAjLXm");
        setField(term111969, term111969.getClass(), "firstRomVersion", "rXhBlGnTbp");
        setField(term111969, term111969.getClass(), "firstDataVersion", "RXrliVaPrQ");
        setIntField(term112129, term112129.getClass(), "year", 2023);
        setShortField(term112129, term112129.getClass(), "month", (short) 8);
        setShortField(term112129, term112129.getClass(), "day", (short) 12);
        setField(term112128, term112128.getClass(), "date", term112129);
        setByteField(term112133, term112133.getClass(), "hour", (byte) 2);
        setByteField(term112133, term112133.getClass(), "minute", (byte) 35);
        setByteField(term112133, term112133.getClass(), "second", (byte) 42);
        setIntField(term112133, term112133.getClass(), "nano", 500080806);
        setField(term112128, term112128.getClass(), "time", term112133);
        setField(term111969, term111969.getClass(), "firstPlayDate", term112128);
        setField(term111969, term111969.getClass(), "lastGameId", "QWnrSwmKgP");
        setField(term111969, term111969.getClass(), "lastRomVersion", "wOeJuAGSwi");
        setField(term111969, term111969.getClass(), "lastDataVersion", "lCalUsJPRJ");
        setIntField(term112175, term112175.getClass(), "year", 2029);
        setShortField(term112175, term112175.getClass(), "month", (short) 6);
        setShortField(term112175, term112175.getClass(), "day", (short) 26);
        setField(term112174, term112174.getClass(), "date", term112175);
        setByteField(term112179, term112179.getClass(), "hour", (byte) 11);
        setByteField(term112179, term112179.getClass(), "minute", (byte) 25);
        setByteField(term112179, term112179.getClass(), "second", (byte) 43);
        setIntField(term112179, term112179.getClass(), "nano", 933618016);
        setField(term112174, term112174.getClass(), "time", term112179);
        setField(term111969, term111969.getClass(), "lastPlayDate", term112174);
        setIntField(term111969, term111969.getClass(), "lastPlaceId", 2138487887);
        setField(term111969, term111969.getClass(), "lastPlaceName", "gFHKkRGUax");
        setField(term111969, term111969.getClass(), "lastRegionId", "paZAviFqsm");
        setField(term111969, term111969.getClass(), "lastRegionName", "GohPpeqrRh");
        setField(term111969, term111969.getClass(), "lastAllNetId", "pfGxZUUbIW");
        setField(term111969, term111969.getClass(), "lastClientId", "GhZQSLeLeq");
        setField(term111967, term111967.getClass(), "user", term111969);
        setIntField(term111967, term111967.getClass(), "characterId", 1608465153);
        setIntField(term111967, term111967.getClass(), "playCount", 1367934188);
        setIntField(term111967, term111967.getClass(), "level", 1);
        setIntField(term111967, term111967.getClass(), "skillId", -1586790224);
        setIntField(term111967, term111967.getClass(), "friendshipExp", 188981994);
        setBooleanField(term111967, term111967.getClass(), "isValid", true);
        setBooleanField(term111967, term111967.getClass(), "isNewMark", true);
        setIntField(term111967, term111967.getClass(), "param1", -1348114075);
        setIntField(term111967, term111967.getClass(), "param2", -1005643858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewMark", argTypes, term111967, args);
    }

};


