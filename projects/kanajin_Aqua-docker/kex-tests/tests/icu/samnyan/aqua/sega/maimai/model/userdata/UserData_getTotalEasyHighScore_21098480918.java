package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_getTotalEasyHighScore_21098480918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4753;

    public UserData_getTotalEasyHighScore_21098480918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4757 = new Long(-6573104506744284592L);
        term4753 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term4755 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4786 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4753, term4753.getClass(), "id", 6617340557564669657L);
        setLongField(term4755, term4755.getClass(), "id", 1439298019805881866L);
        setField(term4755, term4755.getClass(), "extId", term4757);
        setField(term4755, term4755.getClass(), "luid", "BRIVNtfUWU");
        setIntField(term4772, term4772.getClass(), "year", 2010);
        setShortField(term4772, term4772.getClass(), "month", (short) 1);
        setShortField(term4772, term4772.getClass(), "day", (short) 17);
        setField(term4771, term4771.getClass(), "date", term4772);
        setByteField(term4776, term4776.getClass(), "hour", (byte) 13);
        setByteField(term4776, term4776.getClass(), "minute", (byte) 5);
        setByteField(term4776, term4776.getClass(), "second", (byte) 51);
        setIntField(term4776, term4776.getClass(), "nano", 362260580);
        setField(term4771, term4771.getClass(), "time", term4776);
        setField(term4755, term4755.getClass(), "registerTime", term4771);
        setIntField(term4782, term4782.getClass(), "year", 2010);
        setShortField(term4782, term4782.getClass(), "month", (short) 9);
        setShortField(term4782, term4782.getClass(), "day", (short) 28);
        setField(term4781, term4781.getClass(), "date", term4782);
        setByteField(term4786, term4786.getClass(), "hour", (byte) 6);
        setByteField(term4786, term4786.getClass(), "minute", (byte) 4);
        setByteField(term4786, term4786.getClass(), "second", (byte) 54);
        setIntField(term4786, term4786.getClass(), "nano", 604713782);
        setField(term4781, term4781.getClass(), "time", term4786);
        setField(term4755, term4755.getClass(), "accessTime", term4781);
        setField(term4753, term4753.getClass(), "card", term4755);
        setIntField(term4753, term4753.getClass(), "lastDataVersion", 808614267);
        setField(term4753, term4753.getClass(), "userName", "DbiCVtPPCT");
        setIntField(term4753, term4753.getClass(), "point", 1611734632);
        setIntField(term4753, term4753.getClass(), "totalPoint", 868908117);
        setIntField(term4753, term4753.getClass(), "iconId", 1789351397);
        setIntField(term4753, term4753.getClass(), "nameplateId", 2145528170);
        setIntField(term4753, term4753.getClass(), "frameId", -585773976);
        setIntField(term4753, term4753.getClass(), "trophyId", 852806940);
        setIntField(term4753, term4753.getClass(), "playCount", 698551724);
        setIntField(term4753, term4753.getClass(), "playVsCount", -1631048635);
        setIntField(term4753, term4753.getClass(), "playSyncCount", 1342808731);
        setIntField(term4753, term4753.getClass(), "winCount", -64893740);
        setIntField(term4753, term4753.getClass(), "helpCount", -222012928);
        setIntField(term4753, term4753.getClass(), "comboCount", -146564963);
        setIntField(term4753, term4753.getClass(), "feverCount", -83178716);
        setIntField(term4753, term4753.getClass(), "totalHiScore", -1292704466);
        setIntField(term4753, term4753.getClass(), "totalEasyHighScore", 1991858584);
        setIntField(term4753, term4753.getClass(), "totalBasicHighScore", -1300947782);
        setIntField(term4753, term4753.getClass(), "totalAdvancedHighScore", 188512644);
        setIntField(term4753, term4753.getClass(), "totalExpertHighScore", 1851127634);
        setIntField(term4753, term4753.getClass(), "totalMasterHighScore", 783730213);
        setIntField(term4753, term4753.getClass(), "totalReMasterHighScore", 1815951606);
        setIntField(term4753, term4753.getClass(), "totalHighSync", 1105016932);
        setIntField(term4753, term4753.getClass(), "totalEasySync", -365784998);
        setIntField(term4753, term4753.getClass(), "totalBasicSync", -1893236300);
        setIntField(term4753, term4753.getClass(), "totalAdvancedSync", -1858909368);
        setIntField(term4753, term4753.getClass(), "totalExpertSync", -280113263);
        setIntField(term4753, term4753.getClass(), "totalMasterSync", 529625347);
        setIntField(term4753, term4753.getClass(), "totalReMasterSync", 1409095253);
        setIntField(term4753, term4753.getClass(), "playerRating", 315179039);
        setIntField(term4753, term4753.getClass(), "highestRating", -1835923897);
        setIntField(term4753, term4753.getClass(), "rankAuthTailId", -341287775);
        setField(term4753, term4753.getClass(), "eventWatchedDate", "WzFopsaDuG");
        setField(term4753, term4753.getClass(), "webLimitDate", "PapWxkhEWe");
        setIntField(term4753, term4753.getClass(), "challengeTrackPhase", -1651110911);
        setIntField(term4753, term4753.getClass(), "firstPlayBits", -1934033808);
        setField(term4753, term4753.getClass(), "lastPlayDate", "smnHEqRFRx");
        setIntField(term4753, term4753.getClass(), "lastPlaceId", 950322609);
        setField(term4753, term4753.getClass(), "lastPlaceName", "XYtryyobou");
        setIntField(term4753, term4753.getClass(), "lastRegionId", -2023791789);
        setField(term4753, term4753.getClass(), "lastRegionName", "OYbzXylRWW");
        setField(term4753, term4753.getClass(), "lastClientId", "DSNsTGYXDF");
        setField(term4753, term4753.getClass(), "lastCountryCode", "sQvGcVjdEx");
        setIntField(term4753, term4753.getClass(), "eventPoint", 353974456);
        setIntField(term4753, term4753.getClass(), "totalLv", -485108462);
        setIntField(term4753, term4753.getClass(), "lastLoginBonusDay", 1418551216);
        setIntField(term4753, term4753.getClass(), "lastSurvivalBonusDay", -626779272);
        setIntField(term4753, term4753.getClass(), "loginBonusLv", -1150062870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalEasyHighScore", argTypes, term4753, args);
    }

};


