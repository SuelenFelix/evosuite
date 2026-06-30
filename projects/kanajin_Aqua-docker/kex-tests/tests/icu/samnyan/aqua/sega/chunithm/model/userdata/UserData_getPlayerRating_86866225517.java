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

public class UserData_getPlayerRating_86866225517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136623;

    public UserData_getPlayerRating_86866225517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term136627 = new Long(-6685235643232255177L);
        term136623 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term136625 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term136641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136833 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term136623, term136623.getClass(), "id", -3033059928142333838L);
        setLongField(term136625, term136625.getClass(), "id", -3701403882243337652L);
        setField(term136625, term136625.getClass(), "extId", term136627);
        setField(term136625, term136625.getClass(), "luid", "fEiosUzVPM");
        setIntField(term136642, term136642.getClass(), "year", 2017);
        setShortField(term136642, term136642.getClass(), "month", (short) 7);
        setShortField(term136642, term136642.getClass(), "day", (short) 5);
        setField(term136641, term136641.getClass(), "date", term136642);
        setByteField(term136646, term136646.getClass(), "hour", (byte) 0);
        setByteField(term136646, term136646.getClass(), "minute", (byte) 48);
        setByteField(term136646, term136646.getClass(), "second", (byte) 55);
        setIntField(term136646, term136646.getClass(), "nano", 844860119);
        setField(term136641, term136641.getClass(), "time", term136646);
        setField(term136625, term136625.getClass(), "registerTime", term136641);
        setIntField(term136652, term136652.getClass(), "year", 2019);
        setShortField(term136652, term136652.getClass(), "month", (short) 1);
        setShortField(term136652, term136652.getClass(), "day", (short) 21);
        setField(term136651, term136651.getClass(), "date", term136652);
        setByteField(term136656, term136656.getClass(), "hour", (byte) 13);
        setByteField(term136656, term136656.getClass(), "minute", (byte) 7);
        setByteField(term136656, term136656.getClass(), "second", (byte) 20);
        setIntField(term136656, term136656.getClass(), "nano", 614879984);
        setField(term136651, term136651.getClass(), "time", term136656);
        setField(term136625, term136625.getClass(), "accessTime", term136651);
        setField(term136623, term136623.getClass(), "card", term136625);
        setField(term136623, term136623.getClass(), "userName", "USPyxkJGgn");
        setIntField(term136674, term136674.getClass(), "year", 2022);
        setShortField(term136674, term136674.getClass(), "month", (short) 6);
        setShortField(term136674, term136674.getClass(), "day", (short) 24);
        setField(term136673, term136673.getClass(), "date", term136674);
        setByteField(term136678, term136678.getClass(), "hour", (byte) 0);
        setByteField(term136678, term136678.getClass(), "minute", (byte) 49);
        setByteField(term136678, term136678.getClass(), "second", (byte) 35);
        setIntField(term136678, term136678.getClass(), "nano", 108272185);
        setField(term136673, term136673.getClass(), "time", term136678);
        setField(term136623, term136623.getClass(), "lastLoginDate", term136673);
        setBooleanField(term136623, term136623.getClass(), "isWebJoin", false);
        setField(term136623, term136623.getClass(), "webLimitDate", "VniuLGKjLe");
        setIntField(term136623, term136623.getClass(), "level", -91371563);
        setIntField(term136623, term136623.getClass(), "reincarnationNum", 4662703);
        setField(term136623, term136623.getClass(), "exp", "nuzwgdczLX");
        setLongField(term136623, term136623.getClass(), "point", 3650995192859131287L);
        setLongField(term136623, term136623.getClass(), "totalPoint", -3086678982095395565L);
        setIntField(term136623, term136623.getClass(), "playCount", -2118566618);
        setIntField(term136623, term136623.getClass(), "multiPlayCount", 1655029720);
        setIntField(term136623, term136623.getClass(), "multiWinCount", -793892224);
        setIntField(term136623, term136623.getClass(), "requestResCount", 1440702542);
        setIntField(term136623, term136623.getClass(), "acceptResCount", -943970524);
        setIntField(term136623, term136623.getClass(), "successResCount", 917621965);
        setIntField(term136623, term136623.getClass(), "playerRating", 749518086);
        setIntField(term136623, term136623.getClass(), "highestRating", -1596868093);
        setIntField(term136623, term136623.getClass(), "nameplateId", -1081975340);
        setIntField(term136623, term136623.getClass(), "frameId", 1804381424);
        setIntField(term136623, term136623.getClass(), "characterId", 347701928);
        setIntField(term136623, term136623.getClass(), "trophyId", -1540852359);
        setIntField(term136623, term136623.getClass(), "playedTutorialBit", 351747692);
        setIntField(term136623, term136623.getClass(), "firstTutorialCancelNum", 1960962844);
        setIntField(term136623, term136623.getClass(), "masterTutorialCancelNum", 1500998512);
        setIntField(term136623, term136623.getClass(), "totalRepertoireCount", -961310688);
        setIntField(term136623, term136623.getClass(), "totalMapNum", -1837033783);
        setLongField(term136623, term136623.getClass(), "totalHiScore", 1848320676893390599L);
        setLongField(term136623, term136623.getClass(), "totalBasicHighScore", 1438339111595747474L);
        setLongField(term136623, term136623.getClass(), "totalAdvancedHighScore", -1978911449948440575L);
        setLongField(term136623, term136623.getClass(), "totalExpertHighScore", 482416668389920900L);
        setLongField(term136623, term136623.getClass(), "totalMasterHighScore", -3964336945442391045L);
        setIntField(term136735, term136735.getClass(), "year", 2022);
        setShortField(term136735, term136735.getClass(), "month", (short) 4);
        setShortField(term136735, term136735.getClass(), "day", (short) 10);
        setField(term136734, term136734.getClass(), "date", term136735);
        setByteField(term136739, term136739.getClass(), "hour", (byte) 21);
        setByteField(term136739, term136739.getClass(), "minute", (byte) 19);
        setByteField(term136739, term136739.getClass(), "second", (byte) 36);
        setIntField(term136739, term136739.getClass(), "nano", 925743416);
        setField(term136734, term136734.getClass(), "time", term136739);
        setField(term136623, term136623.getClass(), "eventWatchedDate", term136734);
        setIntField(term136623, term136623.getClass(), "friendCount", -33928000);
        setBooleanField(term136623, term136623.getClass(), "isMaimai", true);
        setField(term136623, term136623.getClass(), "firstGameId", "FdFPAsGWZj");
        setField(term136623, term136623.getClass(), "firstRomVersion", "sqctDxfcQV");
        setField(term136623, term136623.getClass(), "firstDataVersion", "KHXlwfHOLE");
        setIntField(term136783, term136783.getClass(), "year", 2016);
        setShortField(term136783, term136783.getClass(), "month", (short) 3);
        setShortField(term136783, term136783.getClass(), "day", (short) 14);
        setField(term136782, term136782.getClass(), "date", term136783);
        setByteField(term136787, term136787.getClass(), "hour", (byte) 18);
        setByteField(term136787, term136787.getClass(), "minute", (byte) 35);
        setByteField(term136787, term136787.getClass(), "second", (byte) 21);
        setIntField(term136787, term136787.getClass(), "nano", 363249410);
        setField(term136782, term136782.getClass(), "time", term136787);
        setField(term136623, term136623.getClass(), "firstPlayDate", term136782);
        setField(term136623, term136623.getClass(), "lastGameId", "oxoYdAYVkI");
        setField(term136623, term136623.getClass(), "lastRomVersion", "jUYVgbuaNi");
        setField(term136623, term136623.getClass(), "lastDataVersion", "IVqaVowLVl");
        setIntField(term136829, term136829.getClass(), "year", 2024);
        setShortField(term136829, term136829.getClass(), "month", (short) 4);
        setShortField(term136829, term136829.getClass(), "day", (short) 10);
        setField(term136828, term136828.getClass(), "date", term136829);
        setByteField(term136833, term136833.getClass(), "hour", (byte) 0);
        setByteField(term136833, term136833.getClass(), "minute", (byte) 37);
        setByteField(term136833, term136833.getClass(), "second", (byte) 26);
        setIntField(term136833, term136833.getClass(), "nano", 518241770);
        setField(term136828, term136828.getClass(), "time", term136833);
        setField(term136623, term136623.getClass(), "lastPlayDate", term136828);
        setIntField(term136623, term136623.getClass(), "lastPlaceId", 1798598770);
        setField(term136623, term136623.getClass(), "lastPlaceName", "wsWWrTxdcC");
        setField(term136623, term136623.getClass(), "lastRegionId", "UPDwVukZbZ");
        setField(term136623, term136623.getClass(), "lastRegionName", "nFQQbKAYNp");
        setField(term136623, term136623.getClass(), "lastAllNetId", "VQkWATPAEW");
        setField(term136623, term136623.getClass(), "lastClientId", "giGfkdhPAE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term136623, args);
    }

};


