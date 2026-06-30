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

public class UserGameOption_init_11137484180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48745;

    public UserGameOption_init_11137484180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48749 = new Long(50358265865610362L);
        term48745 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term48747 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term48763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48909 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48955 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48745, term48745.getClass(), "id", 8324238777146638579L);
        setLongField(term48747, term48747.getClass(), "id", 8580739755779561159L);
        setField(term48747, term48747.getClass(), "extId", term48749);
        setField(term48747, term48747.getClass(), "luid", "SNqwfZGLFh");
        setIntField(term48764, term48764.getClass(), "year", 2015);
        setShortField(term48764, term48764.getClass(), "month", (short) 8);
        setShortField(term48764, term48764.getClass(), "day", (short) 3);
        setField(term48763, term48763.getClass(), "date", term48764);
        setByteField(term48768, term48768.getClass(), "hour", (byte) 21);
        setByteField(term48768, term48768.getClass(), "minute", (byte) 57);
        setByteField(term48768, term48768.getClass(), "second", (byte) 2);
        setIntField(term48768, term48768.getClass(), "nano", 438141628);
        setField(term48763, term48763.getClass(), "time", term48768);
        setField(term48747, term48747.getClass(), "registerTime", term48763);
        setIntField(term48774, term48774.getClass(), "year", 2011);
        setShortField(term48774, term48774.getClass(), "month", (short) 3);
        setShortField(term48774, term48774.getClass(), "day", (short) 10);
        setField(term48773, term48773.getClass(), "date", term48774);
        setByteField(term48778, term48778.getClass(), "hour", (byte) 4);
        setByteField(term48778, term48778.getClass(), "minute", (byte) 13);
        setByteField(term48778, term48778.getClass(), "second", (byte) 46);
        setIntField(term48778, term48778.getClass(), "nano", 212390008);
        setField(term48773, term48773.getClass(), "time", term48778);
        setField(term48747, term48747.getClass(), "accessTime", term48773);
        setField(term48745, term48745.getClass(), "card", term48747);
        setField(term48745, term48745.getClass(), "userName", "sMqpXbgEga");
        setIntField(term48796, term48796.getClass(), "year", 2027);
        setShortField(term48796, term48796.getClass(), "month", (short) 1);
        setShortField(term48796, term48796.getClass(), "day", (short) 10);
        setField(term48795, term48795.getClass(), "date", term48796);
        setByteField(term48800, term48800.getClass(), "hour", (byte) 8);
        setByteField(term48800, term48800.getClass(), "minute", (byte) 34);
        setByteField(term48800, term48800.getClass(), "second", (byte) 28);
        setIntField(term48800, term48800.getClass(), "nano", 703673031);
        setField(term48795, term48795.getClass(), "time", term48800);
        setField(term48745, term48745.getClass(), "lastLoginDate", term48795);
        setBooleanField(term48745, term48745.getClass(), "isWebJoin", false);
        setField(term48745, term48745.getClass(), "webLimitDate", "nYJlDpoMcL");
        setIntField(term48745, term48745.getClass(), "level", 1638508595);
        setIntField(term48745, term48745.getClass(), "reincarnationNum", -114151747);
        setField(term48745, term48745.getClass(), "exp", "SQnbnBmbcf");
        setLongField(term48745, term48745.getClass(), "point", -4916056690424367636L);
        setLongField(term48745, term48745.getClass(), "totalPoint", -971944383326299487L);
        setIntField(term48745, term48745.getClass(), "playCount", -2025145756);
        setIntField(term48745, term48745.getClass(), "multiPlayCount", -1865692813);
        setIntField(term48745, term48745.getClass(), "multiWinCount", 1996398924);
        setIntField(term48745, term48745.getClass(), "requestResCount", -400305198);
        setIntField(term48745, term48745.getClass(), "acceptResCount", 1551023146);
        setIntField(term48745, term48745.getClass(), "successResCount", 545151275);
        setIntField(term48745, term48745.getClass(), "playerRating", -125397975);
        setIntField(term48745, term48745.getClass(), "highestRating", -595763151);
        setIntField(term48745, term48745.getClass(), "nameplateId", -1927187775);
        setIntField(term48745, term48745.getClass(), "frameId", -246129741);
        setIntField(term48745, term48745.getClass(), "characterId", -1681312941);
        setIntField(term48745, term48745.getClass(), "trophyId", -2026593848);
        setIntField(term48745, term48745.getClass(), "playedTutorialBit", -1523977596);
        setIntField(term48745, term48745.getClass(), "firstTutorialCancelNum", -1036117253);
        setIntField(term48745, term48745.getClass(), "masterTutorialCancelNum", -697114016);
        setIntField(term48745, term48745.getClass(), "totalRepertoireCount", 1991952957);
        setIntField(term48745, term48745.getClass(), "totalMapNum", 1877895251);
        setLongField(term48745, term48745.getClass(), "totalHiScore", -5921915827741960720L);
        setLongField(term48745, term48745.getClass(), "totalBasicHighScore", -2480054455719869328L);
        setLongField(term48745, term48745.getClass(), "totalAdvancedHighScore", 8637380632328451251L);
        setLongField(term48745, term48745.getClass(), "totalExpertHighScore", -9204025169674713263L);
        setLongField(term48745, term48745.getClass(), "totalMasterHighScore", 8289082707825797292L);
        setIntField(term48857, term48857.getClass(), "year", 2014);
        setShortField(term48857, term48857.getClass(), "month", (short) 5);
        setShortField(term48857, term48857.getClass(), "day", (short) 30);
        setField(term48856, term48856.getClass(), "date", term48857);
        setByteField(term48861, term48861.getClass(), "hour", (byte) 10);
        setByteField(term48861, term48861.getClass(), "minute", (byte) 34);
        setByteField(term48861, term48861.getClass(), "second", (byte) 17);
        setIntField(term48861, term48861.getClass(), "nano", 917654429);
        setField(term48856, term48856.getClass(), "time", term48861);
        setField(term48745, term48745.getClass(), "eventWatchedDate", term48856);
        setIntField(term48745, term48745.getClass(), "friendCount", 962916253);
        setBooleanField(term48745, term48745.getClass(), "isMaimai", false);
        setField(term48745, term48745.getClass(), "firstGameId", "jaNVteZrZi");
        setField(term48745, term48745.getClass(), "firstRomVersion", "bMRkDiPUGu");
        setField(term48745, term48745.getClass(), "firstDataVersion", "xjKxECGyLT");
        setIntField(term48905, term48905.getClass(), "year", 2026);
        setShortField(term48905, term48905.getClass(), "month", (short) 10);
        setShortField(term48905, term48905.getClass(), "day", (short) 15);
        setField(term48904, term48904.getClass(), "date", term48905);
        setByteField(term48909, term48909.getClass(), "hour", (byte) 15);
        setByteField(term48909, term48909.getClass(), "minute", (byte) 25);
        setByteField(term48909, term48909.getClass(), "second", (byte) 12);
        setIntField(term48909, term48909.getClass(), "nano", 467763340);
        setField(term48904, term48904.getClass(), "time", term48909);
        setField(term48745, term48745.getClass(), "firstPlayDate", term48904);
        setField(term48745, term48745.getClass(), "lastGameId", "ffKeJGEXBT");
        setField(term48745, term48745.getClass(), "lastRomVersion", "rsnXTpfhqf");
        setField(term48745, term48745.getClass(), "lastDataVersion", "gzvlGZVfnZ");
        setIntField(term48951, term48951.getClass(), "year", 2023);
        setShortField(term48951, term48951.getClass(), "month", (short) 1);
        setShortField(term48951, term48951.getClass(), "day", (short) 25);
        setField(term48950, term48950.getClass(), "date", term48951);
        setByteField(term48955, term48955.getClass(), "hour", (byte) 2);
        setByteField(term48955, term48955.getClass(), "minute", (byte) 13);
        setByteField(term48955, term48955.getClass(), "second", (byte) 2);
        setIntField(term48955, term48955.getClass(), "nano", 723644716);
        setField(term48950, term48950.getClass(), "time", term48955);
        setField(term48745, term48745.getClass(), "lastPlayDate", term48950);
        setIntField(term48745, term48745.getClass(), "lastPlaceId", 1580094069);
        setField(term48745, term48745.getClass(), "lastPlaceName", "rmSqCaXWHi");
        setField(term48745, term48745.getClass(), "lastRegionId", "ScztqspySK");
        setField(term48745, term48745.getClass(), "lastRegionName", "IvYxGwWoVu");
        setField(term48745, term48745.getClass(), "lastAllNetId", "XnZHOhTfxL");
        setField(term48745, term48745.getClass(), "lastClientId", "oFBhNamtAs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term48745;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


