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

public class UserDuel_setId_208497913612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80189;
     Object term80485;

    public UserDuel_setId_208497913612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term80195 = new Long(8166095254618543564L);
        term80189 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term80191 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term80193 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term80209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80224 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80476 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term80189, term80189.getClass(), "id", -5710142537128696043L);
        setLongField(term80191, term80191.getClass(), "id", 3423802125971060085L);
        setLongField(term80193, term80193.getClass(), "id", -4876190539375195221L);
        setField(term80193, term80193.getClass(), "extId", term80195);
        setField(term80193, term80193.getClass(), "luid", "wtOVzMPrFU");
        setIntField(term80210, term80210.getClass(), "year", 2022);
        setShortField(term80210, term80210.getClass(), "month", (short) 10);
        setShortField(term80210, term80210.getClass(), "day", (short) 9);
        setField(term80209, term80209.getClass(), "date", term80210);
        setByteField(term80214, term80214.getClass(), "hour", (byte) 13);
        setByteField(term80214, term80214.getClass(), "minute", (byte) 29);
        setByteField(term80214, term80214.getClass(), "second", (byte) 0);
        setIntField(term80214, term80214.getClass(), "nano", 479809645);
        setField(term80209, term80209.getClass(), "time", term80214);
        setField(term80193, term80193.getClass(), "registerTime", term80209);
        setIntField(term80220, term80220.getClass(), "year", 2027);
        setShortField(term80220, term80220.getClass(), "month", (short) 5);
        setShortField(term80220, term80220.getClass(), "day", (short) 9);
        setField(term80219, term80219.getClass(), "date", term80220);
        setByteField(term80224, term80224.getClass(), "hour", (byte) 18);
        setByteField(term80224, term80224.getClass(), "minute", (byte) 17);
        setByteField(term80224, term80224.getClass(), "second", (byte) 45);
        setIntField(term80224, term80224.getClass(), "nano", 184100659);
        setField(term80219, term80219.getClass(), "time", term80224);
        setField(term80193, term80193.getClass(), "accessTime", term80219);
        setField(term80191, term80191.getClass(), "card", term80193);
        setField(term80191, term80191.getClass(), "userName", "CBnamgJrJS");
        setIntField(term80242, term80242.getClass(), "year", 2029);
        setShortField(term80242, term80242.getClass(), "month", (short) 7);
        setShortField(term80242, term80242.getClass(), "day", (short) 19);
        setField(term80241, term80241.getClass(), "date", term80242);
        setByteField(term80246, term80246.getClass(), "hour", (byte) 21);
        setByteField(term80246, term80246.getClass(), "minute", (byte) 46);
        setByteField(term80246, term80246.getClass(), "second", (byte) 27);
        setIntField(term80246, term80246.getClass(), "nano", 413909191);
        setField(term80241, term80241.getClass(), "time", term80246);
        setField(term80191, term80191.getClass(), "lastLoginDate", term80241);
        setBooleanField(term80191, term80191.getClass(), "isWebJoin", true);
        setField(term80191, term80191.getClass(), "webLimitDate", "uJhRRqAnDP");
        setIntField(term80191, term80191.getClass(), "level", -1728526884);
        setIntField(term80191, term80191.getClass(), "reincarnationNum", 78399484);
        setField(term80191, term80191.getClass(), "exp", "hJCqADrhuV");
        setLongField(term80191, term80191.getClass(), "point", -5262639910779325902L);
        setLongField(term80191, term80191.getClass(), "totalPoint", 6267421205498097015L);
        setIntField(term80191, term80191.getClass(), "playCount", -529573926);
        setIntField(term80191, term80191.getClass(), "multiPlayCount", 1526559521);
        setIntField(term80191, term80191.getClass(), "multiWinCount", -1479591438);
        setIntField(term80191, term80191.getClass(), "requestResCount", -1395828554);
        setIntField(term80191, term80191.getClass(), "acceptResCount", -2081139415);
        setIntField(term80191, term80191.getClass(), "successResCount", 22197373);
        setIntField(term80191, term80191.getClass(), "playerRating", 872043914);
        setIntField(term80191, term80191.getClass(), "highestRating", -1710077493);
        setIntField(term80191, term80191.getClass(), "nameplateId", -634148056);
        setIntField(term80191, term80191.getClass(), "frameId", -1791932674);
        setIntField(term80191, term80191.getClass(), "characterId", -2069953525);
        setIntField(term80191, term80191.getClass(), "trophyId", -1911653858);
        setIntField(term80191, term80191.getClass(), "playedTutorialBit", 1817540520);
        setIntField(term80191, term80191.getClass(), "firstTutorialCancelNum", 83060289);
        setIntField(term80191, term80191.getClass(), "masterTutorialCancelNum", -2109132583);
        setIntField(term80191, term80191.getClass(), "totalRepertoireCount", -1992824713);
        setIntField(term80191, term80191.getClass(), "totalMapNum", 1482207601);
        setLongField(term80191, term80191.getClass(), "totalHiScore", 2972970902155476483L);
        setLongField(term80191, term80191.getClass(), "totalBasicHighScore", -6060448108932211661L);
        setLongField(term80191, term80191.getClass(), "totalAdvancedHighScore", -4280668709580845965L);
        setLongField(term80191, term80191.getClass(), "totalExpertHighScore", -8669140240741599474L);
        setLongField(term80191, term80191.getClass(), "totalMasterHighScore", -1131029419147589872L);
        setIntField(term80303, term80303.getClass(), "year", 2024);
        setShortField(term80303, term80303.getClass(), "month", (short) 7);
        setShortField(term80303, term80303.getClass(), "day", (short) 15);
        setField(term80302, term80302.getClass(), "date", term80303);
        setByteField(term80307, term80307.getClass(), "hour", (byte) 14);
        setByteField(term80307, term80307.getClass(), "minute", (byte) 18);
        setByteField(term80307, term80307.getClass(), "second", (byte) 58);
        setIntField(term80307, term80307.getClass(), "nano", 537827095);
        setField(term80302, term80302.getClass(), "time", term80307);
        setField(term80191, term80191.getClass(), "eventWatchedDate", term80302);
        setIntField(term80191, term80191.getClass(), "friendCount", 1943923769);
        setBooleanField(term80191, term80191.getClass(), "isMaimai", false);
        setField(term80191, term80191.getClass(), "firstGameId", "RyPUBlRpNZ");
        setField(term80191, term80191.getClass(), "firstRomVersion", "ardfVpCueq");
        setField(term80191, term80191.getClass(), "firstDataVersion", "wEYAmGJIEF");
        setIntField(term80351, term80351.getClass(), "year", 2025);
        setShortField(term80351, term80351.getClass(), "month", (short) 9);
        setShortField(term80351, term80351.getClass(), "day", (short) 18);
        setField(term80350, term80350.getClass(), "date", term80351);
        setByteField(term80355, term80355.getClass(), "hour", (byte) 9);
        setByteField(term80355, term80355.getClass(), "minute", (byte) 14);
        setByteField(term80355, term80355.getClass(), "second", (byte) 26);
        setIntField(term80355, term80355.getClass(), "nano", 567071659);
        setField(term80350, term80350.getClass(), "time", term80355);
        setField(term80191, term80191.getClass(), "firstPlayDate", term80350);
        setField(term80191, term80191.getClass(), "lastGameId", "iXEhfXJomO");
        setField(term80191, term80191.getClass(), "lastRomVersion", "KEoUMzNdMA");
        setField(term80191, term80191.getClass(), "lastDataVersion", "SOsGYAgpgW");
        setIntField(term80397, term80397.getClass(), "year", 2017);
        setShortField(term80397, term80397.getClass(), "month", (short) 4);
        setShortField(term80397, term80397.getClass(), "day", (short) 16);
        setField(term80396, term80396.getClass(), "date", term80397);
        setByteField(term80401, term80401.getClass(), "hour", (byte) 4);
        setByteField(term80401, term80401.getClass(), "minute", (byte) 46);
        setByteField(term80401, term80401.getClass(), "second", (byte) 10);
        setIntField(term80401, term80401.getClass(), "nano", 543909144);
        setField(term80396, term80396.getClass(), "time", term80401);
        setField(term80191, term80191.getClass(), "lastPlayDate", term80396);
        setIntField(term80191, term80191.getClass(), "lastPlaceId", 125133530);
        setField(term80191, term80191.getClass(), "lastPlaceName", "ZBafuLDRDM");
        setField(term80191, term80191.getClass(), "lastRegionId", "VDnsNuhEvG");
        setField(term80191, term80191.getClass(), "lastRegionName", "DMrfMwXyYT");
        setField(term80191, term80191.getClass(), "lastAllNetId", "GAzZvzjuXP");
        setField(term80191, term80191.getClass(), "lastClientId", "WoFrMqAUlT");
        setField(term80189, term80189.getClass(), "user", term80191);
        setIntField(term80189, term80189.getClass(), "duelId", -1931017542);
        setIntField(term80189, term80189.getClass(), "progress", -619243163);
        setIntField(term80189, term80189.getClass(), "point", 228873608);
        setBooleanField(term80189, term80189.getClass(), "isClear", true);
        setIntField(term80472, term80472.getClass(), "year", 2025);
        setShortField(term80472, term80472.getClass(), "month", (short) 1);
        setShortField(term80472, term80472.getClass(), "day", (short) 18);
        setField(term80471, term80471.getClass(), "date", term80472);
        setByteField(term80476, term80476.getClass(), "hour", (byte) 6);
        setByteField(term80476, term80476.getClass(), "minute", (byte) 53);
        setByteField(term80476, term80476.getClass(), "second", (byte) 54);
        setIntField(term80476, term80476.getClass(), "nano", 781716212);
        setField(term80471, term80471.getClass(), "time", term80476);
        setField(term80189, term80189.getClass(), "lastPlayDate", term80471);
        setIntField(term80189, term80189.getClass(), "param1", 1629097013);
        setIntField(term80189, term80189.getClass(), "param2", 875017307);
        setIntField(term80189, term80189.getClass(), "param3", 523540965);
        setIntField(term80189, term80189.getClass(), "param4", -633850097);
        term80485 = new Long(-5753794060274661933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term80485;
        callMethod(klass, "setId", argTypes, term80189, args);
    }

};


