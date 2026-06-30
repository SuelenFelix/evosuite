package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getLastRegionName_31537893346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18447;

    public ExternalUserData_getLastRegionName_31537893346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18447 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term18472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18538 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18586 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18632 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18447, term18447.getClass(), "accessCode", "dQxXGBtDLZ");
        setField(term18447, term18447.getClass(), "userName", "EgSgEFIyyN");
        setIntField(term18473, term18473.getClass(), "year", 2023);
        setShortField(term18473, term18473.getClass(), "month", (short) 12);
        setShortField(term18473, term18473.getClass(), "day", (short) 12);
        setField(term18472, term18472.getClass(), "date", term18473);
        setByteField(term18477, term18477.getClass(), "hour", (byte) 0);
        setByteField(term18477, term18477.getClass(), "minute", (byte) 12);
        setByteField(term18477, term18477.getClass(), "second", (byte) 38);
        setIntField(term18477, term18477.getClass(), "nano", 430999236);
        setField(term18472, term18472.getClass(), "time", term18477);
        setField(term18447, term18447.getClass(), "lastLoginDate", term18472);
        setBooleanField(term18447, term18447.getClass(), "isWebJoin", true);
        setField(term18447, term18447.getClass(), "webLimitDate", "iAOFcXaLSf");
        setIntField(term18447, term18447.getClass(), "level", 2021136615);
        setIntField(term18447, term18447.getClass(), "reincarnationNum", 1778570695);
        setField(term18447, term18447.getClass(), "exp", "EHoNUaeyvT");
        setLongField(term18447, term18447.getClass(), "point", -187772971269812453L);
        setLongField(term18447, term18447.getClass(), "totalPoint", 468487103823886117L);
        setIntField(term18447, term18447.getClass(), "playCount", -1142164411);
        setIntField(term18447, term18447.getClass(), "multiPlayCount", -1619435313);
        setIntField(term18447, term18447.getClass(), "multiWinCount", 1013801066);
        setIntField(term18447, term18447.getClass(), "requestResCount", 1512541853);
        setIntField(term18447, term18447.getClass(), "acceptResCount", -965421502);
        setIntField(term18447, term18447.getClass(), "successResCount", 1319026002);
        setIntField(term18447, term18447.getClass(), "playerRating", -1368173231);
        setIntField(term18447, term18447.getClass(), "highestRating", 1956006038);
        setIntField(term18447, term18447.getClass(), "nameplateId", -1062304878);
        setIntField(term18447, term18447.getClass(), "frameId", -1377876610);
        setIntField(term18447, term18447.getClass(), "characterId", -1456184732);
        setIntField(term18447, term18447.getClass(), "trophyId", 1689228897);
        setIntField(term18447, term18447.getClass(), "playedTutorialBit", 892205855);
        setIntField(term18447, term18447.getClass(), "firstTutorialCancelNum", 1955560079);
        setIntField(term18447, term18447.getClass(), "masterTutorialCancelNum", -1330529019);
        setIntField(term18447, term18447.getClass(), "totalRepertoireCount", 237134844);
        setIntField(term18447, term18447.getClass(), "totalMapNum", 2076413861);
        setLongField(term18447, term18447.getClass(), "totalHiScore", 4139034517298316285L);
        setLongField(term18447, term18447.getClass(), "totalBasicHighScore", 5797412846146719084L);
        setLongField(term18447, term18447.getClass(), "totalAdvancedHighScore", 5319740127125920367L);
        setLongField(term18447, term18447.getClass(), "totalExpertHighScore", 6465987664600701876L);
        setLongField(term18447, term18447.getClass(), "totalMasterHighScore", -136372844051852955L);
        setIntField(term18534, term18534.getClass(), "year", 2018);
        setShortField(term18534, term18534.getClass(), "month", (short) 6);
        setShortField(term18534, term18534.getClass(), "day", (short) 17);
        setField(term18533, term18533.getClass(), "date", term18534);
        setByteField(term18538, term18538.getClass(), "hour", (byte) 1);
        setByteField(term18538, term18538.getClass(), "minute", (byte) 3);
        setByteField(term18538, term18538.getClass(), "second", (byte) 5);
        setIntField(term18538, term18538.getClass(), "nano", 914834044);
        setField(term18533, term18533.getClass(), "time", term18538);
        setField(term18447, term18447.getClass(), "eventWatchedDate", term18533);
        setIntField(term18447, term18447.getClass(), "friendCount", 66817373);
        setBooleanField(term18447, term18447.getClass(), "isMaimai", true);
        setField(term18447, term18447.getClass(), "firstGameId", "ZwKmasCVIy");
        setField(term18447, term18447.getClass(), "firstRomVersion", "pxokrVaeMd");
        setField(term18447, term18447.getClass(), "firstDataVersion", "ujxmmZZcbT");
        setIntField(term18582, term18582.getClass(), "year", 2021);
        setShortField(term18582, term18582.getClass(), "month", (short) 5);
        setShortField(term18582, term18582.getClass(), "day", (short) 6);
        setField(term18581, term18581.getClass(), "date", term18582);
        setByteField(term18586, term18586.getClass(), "hour", (byte) 21);
        setByteField(term18586, term18586.getClass(), "minute", (byte) 10);
        setByteField(term18586, term18586.getClass(), "second", (byte) 43);
        setIntField(term18586, term18586.getClass(), "nano", 123313014);
        setField(term18581, term18581.getClass(), "time", term18586);
        setField(term18447, term18447.getClass(), "firstPlayDate", term18581);
        setField(term18447, term18447.getClass(), "lastGameId", "BOvgwHfoHQ");
        setField(term18447, term18447.getClass(), "lastRomVersion", "hPpFNeDBIb");
        setField(term18447, term18447.getClass(), "lastDataVersion", "DNOtiLPAIY");
        setIntField(term18628, term18628.getClass(), "year", 2011);
        setShortField(term18628, term18628.getClass(), "month", (short) 6);
        setShortField(term18628, term18628.getClass(), "day", (short) 21);
        setField(term18627, term18627.getClass(), "date", term18628);
        setByteField(term18632, term18632.getClass(), "hour", (byte) 3);
        setByteField(term18632, term18632.getClass(), "minute", (byte) 19);
        setByteField(term18632, term18632.getClass(), "second", (byte) 41);
        setIntField(term18632, term18632.getClass(), "nano", 920537748);
        setField(term18627, term18627.getClass(), "time", term18632);
        setField(term18447, term18447.getClass(), "lastPlayDate", term18627);
        setIntField(term18447, term18447.getClass(), "lastPlaceId", 1459628013);
        setField(term18447, term18447.getClass(), "lastPlaceName", "FnEkAHBfyV");
        setField(term18447, term18447.getClass(), "lastRegionId", "VfmNFpEuax");
        setField(term18447, term18447.getClass(), "lastRegionName", "ANHjlWPmZG");
        setField(term18447, term18447.getClass(), "lastAllNetId", "SibzENsyyy");
        setField(term18447, term18447.getClass(), "lastClientId", "mrqGHotaef");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term18447, args);
    }

};


