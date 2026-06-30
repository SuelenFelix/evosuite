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

public class UserData_setMasterTutorialCancelNum_118413439575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161493;
     Object term161769;

    public UserData_setMasterTutorialCancelNum_118413439575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161497 = new Long(3746481521207337771L);
        term161493 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term161495 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161548 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161609 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161703 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161493, term161493.getClass(), "id", -1518888676325043386L);
        setLongField(term161495, term161495.getClass(), "id", -2277595927632613248L);
        setField(term161495, term161495.getClass(), "extId", term161497);
        setField(term161495, term161495.getClass(), "luid", "fdRVcZbqUf");
        setIntField(term161512, term161512.getClass(), "year", 2028);
        setShortField(term161512, term161512.getClass(), "month", (short) 6);
        setShortField(term161512, term161512.getClass(), "day", (short) 29);
        setField(term161511, term161511.getClass(), "date", term161512);
        setByteField(term161516, term161516.getClass(), "hour", (byte) 3);
        setByteField(term161516, term161516.getClass(), "minute", (byte) 23);
        setByteField(term161516, term161516.getClass(), "second", (byte) 45);
        setIntField(term161516, term161516.getClass(), "nano", 919444432);
        setField(term161511, term161511.getClass(), "time", term161516);
        setField(term161495, term161495.getClass(), "registerTime", term161511);
        setIntField(term161522, term161522.getClass(), "year", 2015);
        setShortField(term161522, term161522.getClass(), "month", (short) 9);
        setShortField(term161522, term161522.getClass(), "day", (short) 3);
        setField(term161521, term161521.getClass(), "date", term161522);
        setByteField(term161526, term161526.getClass(), "hour", (byte) 10);
        setByteField(term161526, term161526.getClass(), "minute", (byte) 8);
        setByteField(term161526, term161526.getClass(), "second", (byte) 0);
        setIntField(term161526, term161526.getClass(), "nano", 933314219);
        setField(term161521, term161521.getClass(), "time", term161526);
        setField(term161495, term161495.getClass(), "accessTime", term161521);
        setField(term161493, term161493.getClass(), "card", term161495);
        setField(term161493, term161493.getClass(), "userName", "aSUSvETRSv");
        setIntField(term161544, term161544.getClass(), "year", 2016);
        setShortField(term161544, term161544.getClass(), "month", (short) 4);
        setShortField(term161544, term161544.getClass(), "day", (short) 24);
        setField(term161543, term161543.getClass(), "date", term161544);
        setByteField(term161548, term161548.getClass(), "hour", (byte) 23);
        setByteField(term161548, term161548.getClass(), "minute", (byte) 44);
        setByteField(term161548, term161548.getClass(), "second", (byte) 44);
        setIntField(term161548, term161548.getClass(), "nano", 951446047);
        setField(term161543, term161543.getClass(), "time", term161548);
        setField(term161493, term161493.getClass(), "lastLoginDate", term161543);
        setBooleanField(term161493, term161493.getClass(), "isWebJoin", false);
        setField(term161493, term161493.getClass(), "webLimitDate", "daQciREiuI");
        setIntField(term161493, term161493.getClass(), "level", -838056504);
        setIntField(term161493, term161493.getClass(), "reincarnationNum", 216597043);
        setField(term161493, term161493.getClass(), "exp", "AFRfAPZdqf");
        setLongField(term161493, term161493.getClass(), "point", 1646543620789839486L);
        setLongField(term161493, term161493.getClass(), "totalPoint", -6411181823365531813L);
        setIntField(term161493, term161493.getClass(), "playCount", -1863649948);
        setIntField(term161493, term161493.getClass(), "multiPlayCount", 1188132768);
        setIntField(term161493, term161493.getClass(), "multiWinCount", -210441864);
        setIntField(term161493, term161493.getClass(), "requestResCount", -993404406);
        setIntField(term161493, term161493.getClass(), "acceptResCount", -843807783);
        setIntField(term161493, term161493.getClass(), "successResCount", -1540931841);
        setIntField(term161493, term161493.getClass(), "playerRating", 1086303241);
        setIntField(term161493, term161493.getClass(), "highestRating", 602126411);
        setIntField(term161493, term161493.getClass(), "nameplateId", -1382786777);
        setIntField(term161493, term161493.getClass(), "frameId", -653869267);
        setIntField(term161493, term161493.getClass(), "characterId", 2108460000);
        setIntField(term161493, term161493.getClass(), "trophyId", 464860665);
        setIntField(term161493, term161493.getClass(), "playedTutorialBit", -829472053);
        setIntField(term161493, term161493.getClass(), "firstTutorialCancelNum", 1237212779);
        setIntField(term161493, term161493.getClass(), "masterTutorialCancelNum", -733200940);
        setIntField(term161493, term161493.getClass(), "totalRepertoireCount", -2099756995);
        setIntField(term161493, term161493.getClass(), "totalMapNum", 146626977);
        setLongField(term161493, term161493.getClass(), "totalHiScore", 7276586941776899290L);
        setLongField(term161493, term161493.getClass(), "totalBasicHighScore", -189747828072599611L);
        setLongField(term161493, term161493.getClass(), "totalAdvancedHighScore", -1842662994637603666L);
        setLongField(term161493, term161493.getClass(), "totalExpertHighScore", -5123487854241278445L);
        setLongField(term161493, term161493.getClass(), "totalMasterHighScore", -2607843712049587713L);
        setIntField(term161605, term161605.getClass(), "year", 2011);
        setShortField(term161605, term161605.getClass(), "month", (short) 12);
        setShortField(term161605, term161605.getClass(), "day", (short) 8);
        setField(term161604, term161604.getClass(), "date", term161605);
        setByteField(term161609, term161609.getClass(), "hour", (byte) 11);
        setByteField(term161609, term161609.getClass(), "minute", (byte) 9);
        setByteField(term161609, term161609.getClass(), "second", (byte) 46);
        setIntField(term161609, term161609.getClass(), "nano", 36011397);
        setField(term161604, term161604.getClass(), "time", term161609);
        setField(term161493, term161493.getClass(), "eventWatchedDate", term161604);
        setIntField(term161493, term161493.getClass(), "friendCount", 588479166);
        setBooleanField(term161493, term161493.getClass(), "isMaimai", true);
        setField(term161493, term161493.getClass(), "firstGameId", "cZrxYHSQhL");
        setField(term161493, term161493.getClass(), "firstRomVersion", "fhPRWcwAlA");
        setField(term161493, term161493.getClass(), "firstDataVersion", "hNoRxfoxPM");
        setIntField(term161653, term161653.getClass(), "year", 2026);
        setShortField(term161653, term161653.getClass(), "month", (short) 7);
        setShortField(term161653, term161653.getClass(), "day", (short) 17);
        setField(term161652, term161652.getClass(), "date", term161653);
        setByteField(term161657, term161657.getClass(), "hour", (byte) 23);
        setByteField(term161657, term161657.getClass(), "minute", (byte) 54);
        setByteField(term161657, term161657.getClass(), "second", (byte) 47);
        setIntField(term161657, term161657.getClass(), "nano", 673783949);
        setField(term161652, term161652.getClass(), "time", term161657);
        setField(term161493, term161493.getClass(), "firstPlayDate", term161652);
        setField(term161493, term161493.getClass(), "lastGameId", "AkemusjkVp");
        setField(term161493, term161493.getClass(), "lastRomVersion", "rqjMeNBTEM");
        setField(term161493, term161493.getClass(), "lastDataVersion", "WNUzKkDpZX");
        setIntField(term161699, term161699.getClass(), "year", 2018);
        setShortField(term161699, term161699.getClass(), "month", (short) 2);
        setShortField(term161699, term161699.getClass(), "day", (short) 23);
        setField(term161698, term161698.getClass(), "date", term161699);
        setByteField(term161703, term161703.getClass(), "hour", (byte) 0);
        setByteField(term161703, term161703.getClass(), "minute", (byte) 12);
        setByteField(term161703, term161703.getClass(), "second", (byte) 19);
        setIntField(term161703, term161703.getClass(), "nano", 402023577);
        setField(term161698, term161698.getClass(), "time", term161703);
        setField(term161493, term161493.getClass(), "lastPlayDate", term161698);
        setIntField(term161493, term161493.getClass(), "lastPlaceId", 555940372);
        setField(term161493, term161493.getClass(), "lastPlaceName", "aduqofSIXN");
        setField(term161493, term161493.getClass(), "lastRegionId", "oDCJeRRdBM");
        setField(term161493, term161493.getClass(), "lastRegionName", "RqPlzjjWzi");
        setField(term161493, term161493.getClass(), "lastAllNetId", "rTGRmrdzoJ");
        setField(term161493, term161493.getClass(), "lastClientId", "ZWjeJhPPnm");
        term161769 = new Integer(303574393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term161769;
        callMethod(klass, "setMasterTutorialCancelNum", argTypes, term161493, args);
    }

};


