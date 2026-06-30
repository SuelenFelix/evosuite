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

public class UserData_setFriendCount_60269545684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165353;
     Object term165629;

    public UserData_setFriendCount_60269545684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165357 = new Long(-2136893352275781569L);
        term165353 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term165355 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term165371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165386 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165517 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165563 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term165353, term165353.getClass(), "id", 3666152876006735353L);
        setLongField(term165355, term165355.getClass(), "id", -2786639501005568264L);
        setField(term165355, term165355.getClass(), "extId", term165357);
        setField(term165355, term165355.getClass(), "luid", "JIYvHbwfiy");
        setIntField(term165372, term165372.getClass(), "year", 2015);
        setShortField(term165372, term165372.getClass(), "month", (short) 10);
        setShortField(term165372, term165372.getClass(), "day", (short) 19);
        setField(term165371, term165371.getClass(), "date", term165372);
        setByteField(term165376, term165376.getClass(), "hour", (byte) 18);
        setByteField(term165376, term165376.getClass(), "minute", (byte) 43);
        setByteField(term165376, term165376.getClass(), "second", (byte) 31);
        setIntField(term165376, term165376.getClass(), "nano", 573923432);
        setField(term165371, term165371.getClass(), "time", term165376);
        setField(term165355, term165355.getClass(), "registerTime", term165371);
        setIntField(term165382, term165382.getClass(), "year", 2022);
        setShortField(term165382, term165382.getClass(), "month", (short) 3);
        setShortField(term165382, term165382.getClass(), "day", (short) 4);
        setField(term165381, term165381.getClass(), "date", term165382);
        setByteField(term165386, term165386.getClass(), "hour", (byte) 19);
        setByteField(term165386, term165386.getClass(), "minute", (byte) 36);
        setByteField(term165386, term165386.getClass(), "second", (byte) 59);
        setIntField(term165386, term165386.getClass(), "nano", 167560002);
        setField(term165381, term165381.getClass(), "time", term165386);
        setField(term165355, term165355.getClass(), "accessTime", term165381);
        setField(term165353, term165353.getClass(), "card", term165355);
        setField(term165353, term165353.getClass(), "userName", "YheKvmZTNn");
        setIntField(term165404, term165404.getClass(), "year", 2024);
        setShortField(term165404, term165404.getClass(), "month", (short) 12);
        setShortField(term165404, term165404.getClass(), "day", (short) 19);
        setField(term165403, term165403.getClass(), "date", term165404);
        setByteField(term165408, term165408.getClass(), "hour", (byte) 6);
        setByteField(term165408, term165408.getClass(), "minute", (byte) 25);
        setByteField(term165408, term165408.getClass(), "second", (byte) 9);
        setIntField(term165408, term165408.getClass(), "nano", 440680941);
        setField(term165403, term165403.getClass(), "time", term165408);
        setField(term165353, term165353.getClass(), "lastLoginDate", term165403);
        setBooleanField(term165353, term165353.getClass(), "isWebJoin", true);
        setField(term165353, term165353.getClass(), "webLimitDate", "cLPBTxvmBL");
        setIntField(term165353, term165353.getClass(), "level", 294062046);
        setIntField(term165353, term165353.getClass(), "reincarnationNum", 506380814);
        setField(term165353, term165353.getClass(), "exp", "BqBLmrxQoP");
        setLongField(term165353, term165353.getClass(), "point", 3887138438306476169L);
        setLongField(term165353, term165353.getClass(), "totalPoint", 1288678855951342110L);
        setIntField(term165353, term165353.getClass(), "playCount", 2141338064);
        setIntField(term165353, term165353.getClass(), "multiPlayCount", 1629871);
        setIntField(term165353, term165353.getClass(), "multiWinCount", 745945402);
        setIntField(term165353, term165353.getClass(), "requestResCount", 1563368376);
        setIntField(term165353, term165353.getClass(), "acceptResCount", -253159654);
        setIntField(term165353, term165353.getClass(), "successResCount", 1226284936);
        setIntField(term165353, term165353.getClass(), "playerRating", 1372790052);
        setIntField(term165353, term165353.getClass(), "highestRating", -784035623);
        setIntField(term165353, term165353.getClass(), "nameplateId", 1007848598);
        setIntField(term165353, term165353.getClass(), "frameId", -1042332332);
        setIntField(term165353, term165353.getClass(), "characterId", 752158731);
        setIntField(term165353, term165353.getClass(), "trophyId", 941368721);
        setIntField(term165353, term165353.getClass(), "playedTutorialBit", -1460524367);
        setIntField(term165353, term165353.getClass(), "firstTutorialCancelNum", 947338447);
        setIntField(term165353, term165353.getClass(), "masterTutorialCancelNum", -1451763306);
        setIntField(term165353, term165353.getClass(), "totalRepertoireCount", -1644935195);
        setIntField(term165353, term165353.getClass(), "totalMapNum", 1161859055);
        setLongField(term165353, term165353.getClass(), "totalHiScore", -2483785120171854174L);
        setLongField(term165353, term165353.getClass(), "totalBasicHighScore", 246102557771929635L);
        setLongField(term165353, term165353.getClass(), "totalAdvancedHighScore", 8013180001130062999L);
        setLongField(term165353, term165353.getClass(), "totalExpertHighScore", -7249189341298396374L);
        setLongField(term165353, term165353.getClass(), "totalMasterHighScore", 8170323121887011771L);
        setIntField(term165465, term165465.getClass(), "year", 2010);
        setShortField(term165465, term165465.getClass(), "month", (short) 1);
        setShortField(term165465, term165465.getClass(), "day", (short) 27);
        setField(term165464, term165464.getClass(), "date", term165465);
        setByteField(term165469, term165469.getClass(), "hour", (byte) 15);
        setByteField(term165469, term165469.getClass(), "minute", (byte) 41);
        setByteField(term165469, term165469.getClass(), "second", (byte) 25);
        setIntField(term165469, term165469.getClass(), "nano", 3794523);
        setField(term165464, term165464.getClass(), "time", term165469);
        setField(term165353, term165353.getClass(), "eventWatchedDate", term165464);
        setIntField(term165353, term165353.getClass(), "friendCount", 1235637820);
        setBooleanField(term165353, term165353.getClass(), "isMaimai", false);
        setField(term165353, term165353.getClass(), "firstGameId", "wGTLHXqSLS");
        setField(term165353, term165353.getClass(), "firstRomVersion", "vcDcmZWIgW");
        setField(term165353, term165353.getClass(), "firstDataVersion", "hpFqndTGJq");
        setIntField(term165513, term165513.getClass(), "year", 2014);
        setShortField(term165513, term165513.getClass(), "month", (short) 12);
        setShortField(term165513, term165513.getClass(), "day", (short) 20);
        setField(term165512, term165512.getClass(), "date", term165513);
        setByteField(term165517, term165517.getClass(), "hour", (byte) 2);
        setByteField(term165517, term165517.getClass(), "minute", (byte) 2);
        setByteField(term165517, term165517.getClass(), "second", (byte) 37);
        setIntField(term165517, term165517.getClass(), "nano", 911863512);
        setField(term165512, term165512.getClass(), "time", term165517);
        setField(term165353, term165353.getClass(), "firstPlayDate", term165512);
        setField(term165353, term165353.getClass(), "lastGameId", "aLNaauObcW");
        setField(term165353, term165353.getClass(), "lastRomVersion", "rKOiGTBanj");
        setField(term165353, term165353.getClass(), "lastDataVersion", "sUmSSAVUAl");
        setIntField(term165559, term165559.getClass(), "year", 2022);
        setShortField(term165559, term165559.getClass(), "month", (short) 5);
        setShortField(term165559, term165559.getClass(), "day", (short) 31);
        setField(term165558, term165558.getClass(), "date", term165559);
        setByteField(term165563, term165563.getClass(), "hour", (byte) 7);
        setByteField(term165563, term165563.getClass(), "minute", (byte) 43);
        setByteField(term165563, term165563.getClass(), "second", (byte) 59);
        setIntField(term165563, term165563.getClass(), "nano", 823624135);
        setField(term165558, term165558.getClass(), "time", term165563);
        setField(term165353, term165353.getClass(), "lastPlayDate", term165558);
        setIntField(term165353, term165353.getClass(), "lastPlaceId", -120629892);
        setField(term165353, term165353.getClass(), "lastPlaceName", "bUrzffmZhc");
        setField(term165353, term165353.getClass(), "lastRegionId", "hvogGekBHB");
        setField(term165353, term165353.getClass(), "lastRegionName", "KAxZjUYFWX");
        setField(term165353, term165353.getClass(), "lastAllNetId", "dnWLZqVKzE");
        setField(term165353, term165353.getClass(), "lastClientId", "yKNhWIXreq");
        term165629 = new Integer(-1054441261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term165629;
        callMethod(klass, "setFriendCount", argTypes, term165353, args);
    }

};


