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

public class UserData_getLastPlaceName_42212185045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148551;

    public UserData_getLastPlaceName_42212185045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148555 = new Long(-1964501434345816975L);
        term148551 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term148553 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term148569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148574 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148584 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148667 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148715 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148761 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term148551, term148551.getClass(), "id", 2910835673340027471L);
        setLongField(term148553, term148553.getClass(), "id", 7535740177428257169L);
        setField(term148553, term148553.getClass(), "extId", term148555);
        setField(term148553, term148553.getClass(), "luid", "AGyEIGYbwx");
        setIntField(term148570, term148570.getClass(), "year", 2011);
        setShortField(term148570, term148570.getClass(), "month", (short) 2);
        setShortField(term148570, term148570.getClass(), "day", (short) 2);
        setField(term148569, term148569.getClass(), "date", term148570);
        setByteField(term148574, term148574.getClass(), "hour", (byte) 20);
        setByteField(term148574, term148574.getClass(), "minute", (byte) 34);
        setByteField(term148574, term148574.getClass(), "second", (byte) 47);
        setIntField(term148574, term148574.getClass(), "nano", 477725804);
        setField(term148569, term148569.getClass(), "time", term148574);
        setField(term148553, term148553.getClass(), "registerTime", term148569);
        setIntField(term148580, term148580.getClass(), "year", 2012);
        setShortField(term148580, term148580.getClass(), "month", (short) 10);
        setShortField(term148580, term148580.getClass(), "day", (short) 13);
        setField(term148579, term148579.getClass(), "date", term148580);
        setByteField(term148584, term148584.getClass(), "hour", (byte) 6);
        setByteField(term148584, term148584.getClass(), "minute", (byte) 4);
        setByteField(term148584, term148584.getClass(), "second", (byte) 24);
        setIntField(term148584, term148584.getClass(), "nano", 975370047);
        setField(term148579, term148579.getClass(), "time", term148584);
        setField(term148553, term148553.getClass(), "accessTime", term148579);
        setField(term148551, term148551.getClass(), "card", term148553);
        setField(term148551, term148551.getClass(), "userName", "nOkegthvTo");
        setIntField(term148602, term148602.getClass(), "year", 2024);
        setShortField(term148602, term148602.getClass(), "month", (short) 6);
        setShortField(term148602, term148602.getClass(), "day", (short) 13);
        setField(term148601, term148601.getClass(), "date", term148602);
        setByteField(term148606, term148606.getClass(), "hour", (byte) 9);
        setByteField(term148606, term148606.getClass(), "minute", (byte) 54);
        setByteField(term148606, term148606.getClass(), "second", (byte) 56);
        setIntField(term148606, term148606.getClass(), "nano", 719396969);
        setField(term148601, term148601.getClass(), "time", term148606);
        setField(term148551, term148551.getClass(), "lastLoginDate", term148601);
        setBooleanField(term148551, term148551.getClass(), "isWebJoin", true);
        setField(term148551, term148551.getClass(), "webLimitDate", "QIBFEnRCeZ");
        setIntField(term148551, term148551.getClass(), "level", -1686618770);
        setIntField(term148551, term148551.getClass(), "reincarnationNum", -1592104600);
        setField(term148551, term148551.getClass(), "exp", "HVMLhVrWly");
        setLongField(term148551, term148551.getClass(), "point", -217553849551393777L);
        setLongField(term148551, term148551.getClass(), "totalPoint", -4567914077856781243L);
        setIntField(term148551, term148551.getClass(), "playCount", -500126132);
        setIntField(term148551, term148551.getClass(), "multiPlayCount", -327712746);
        setIntField(term148551, term148551.getClass(), "multiWinCount", -1446388321);
        setIntField(term148551, term148551.getClass(), "requestResCount", 283077570);
        setIntField(term148551, term148551.getClass(), "acceptResCount", -1013688248);
        setIntField(term148551, term148551.getClass(), "successResCount", -164074275);
        setIntField(term148551, term148551.getClass(), "playerRating", 344170834);
        setIntField(term148551, term148551.getClass(), "highestRating", -305813067);
        setIntField(term148551, term148551.getClass(), "nameplateId", 956385164);
        setIntField(term148551, term148551.getClass(), "frameId", -696090550);
        setIntField(term148551, term148551.getClass(), "characterId", -453710990);
        setIntField(term148551, term148551.getClass(), "trophyId", -986333882);
        setIntField(term148551, term148551.getClass(), "playedTutorialBit", -163205883);
        setIntField(term148551, term148551.getClass(), "firstTutorialCancelNum", -1916495224);
        setIntField(term148551, term148551.getClass(), "masterTutorialCancelNum", -409557637);
        setIntField(term148551, term148551.getClass(), "totalRepertoireCount", 1817886491);
        setIntField(term148551, term148551.getClass(), "totalMapNum", 252819186);
        setLongField(term148551, term148551.getClass(), "totalHiScore", -3772628385704266817L);
        setLongField(term148551, term148551.getClass(), "totalBasicHighScore", 3674075662000201844L);
        setLongField(term148551, term148551.getClass(), "totalAdvancedHighScore", 5265812777907707400L);
        setLongField(term148551, term148551.getClass(), "totalExpertHighScore", 7752215053758781516L);
        setLongField(term148551, term148551.getClass(), "totalMasterHighScore", 2100213380733826749L);
        setIntField(term148663, term148663.getClass(), "year", 2011);
        setShortField(term148663, term148663.getClass(), "month", (short) 8);
        setShortField(term148663, term148663.getClass(), "day", (short) 26);
        setField(term148662, term148662.getClass(), "date", term148663);
        setByteField(term148667, term148667.getClass(), "hour", (byte) 21);
        setByteField(term148667, term148667.getClass(), "minute", (byte) 4);
        setByteField(term148667, term148667.getClass(), "second", (byte) 7);
        setIntField(term148667, term148667.getClass(), "nano", 85288093);
        setField(term148662, term148662.getClass(), "time", term148667);
        setField(term148551, term148551.getClass(), "eventWatchedDate", term148662);
        setIntField(term148551, term148551.getClass(), "friendCount", -1730296941);
        setBooleanField(term148551, term148551.getClass(), "isMaimai", true);
        setField(term148551, term148551.getClass(), "firstGameId", "yVHTwpMOSD");
        setField(term148551, term148551.getClass(), "firstRomVersion", "ZFThLVgXzT");
        setField(term148551, term148551.getClass(), "firstDataVersion", "wpSuVLuVSu");
        setIntField(term148711, term148711.getClass(), "year", 2027);
        setShortField(term148711, term148711.getClass(), "month", (short) 7);
        setShortField(term148711, term148711.getClass(), "day", (short) 19);
        setField(term148710, term148710.getClass(), "date", term148711);
        setByteField(term148715, term148715.getClass(), "hour", (byte) 22);
        setByteField(term148715, term148715.getClass(), "minute", (byte) 28);
        setByteField(term148715, term148715.getClass(), "second", (byte) 53);
        setIntField(term148715, term148715.getClass(), "nano", 43270385);
        setField(term148710, term148710.getClass(), "time", term148715);
        setField(term148551, term148551.getClass(), "firstPlayDate", term148710);
        setField(term148551, term148551.getClass(), "lastGameId", "BauBYWlTXL");
        setField(term148551, term148551.getClass(), "lastRomVersion", "dAoPTQFCFN");
        setField(term148551, term148551.getClass(), "lastDataVersion", "AAVsuSsxLS");
        setIntField(term148757, term148757.getClass(), "year", 2014);
        setShortField(term148757, term148757.getClass(), "month", (short) 2);
        setShortField(term148757, term148757.getClass(), "day", (short) 20);
        setField(term148756, term148756.getClass(), "date", term148757);
        setByteField(term148761, term148761.getClass(), "hour", (byte) 22);
        setByteField(term148761, term148761.getClass(), "minute", (byte) 30);
        setByteField(term148761, term148761.getClass(), "second", (byte) 9);
        setIntField(term148761, term148761.getClass(), "nano", 11073851);
        setField(term148756, term148756.getClass(), "time", term148761);
        setField(term148551, term148551.getClass(), "lastPlayDate", term148756);
        setIntField(term148551, term148551.getClass(), "lastPlaceId", 315600005);
        setField(term148551, term148551.getClass(), "lastPlaceName", "ElCmThplmP");
        setField(term148551, term148551.getClass(), "lastRegionId", "QmHpkkQsav");
        setField(term148551, term148551.getClass(), "lastRegionName", "hMSzYZiZXX");
        setField(term148551, term148551.getClass(), "lastAllNetId", "XDCvxTTtyO");
        setField(term148551, term148551.getClass(), "lastClientId", "kOpXEPJinJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term148551, args);
    }

};


