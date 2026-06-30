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

public class UserData_setFirstPlayDate_78536065689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167553;
     Object term167829;

    public UserData_setFirstPlayDate_78536065689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term167557 = new Long(-3225860270104198596L);
        term167553 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term167555 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term167571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167586 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167608 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167669 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167717 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167763 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term167553, term167553.getClass(), "id", 6908358662328756989L);
        setLongField(term167555, term167555.getClass(), "id", -8010919718941207419L);
        setField(term167555, term167555.getClass(), "extId", term167557);
        setField(term167555, term167555.getClass(), "luid", "XaYdQMGKRk");
        setIntField(term167572, term167572.getClass(), "year", 2023);
        setShortField(term167572, term167572.getClass(), "month", (short) 2);
        setShortField(term167572, term167572.getClass(), "day", (short) 21);
        setField(term167571, term167571.getClass(), "date", term167572);
        setByteField(term167576, term167576.getClass(), "hour", (byte) 4);
        setByteField(term167576, term167576.getClass(), "minute", (byte) 51);
        setByteField(term167576, term167576.getClass(), "second", (byte) 30);
        setIntField(term167576, term167576.getClass(), "nano", 429637788);
        setField(term167571, term167571.getClass(), "time", term167576);
        setField(term167555, term167555.getClass(), "registerTime", term167571);
        setIntField(term167582, term167582.getClass(), "year", 2022);
        setShortField(term167582, term167582.getClass(), "month", (short) 6);
        setShortField(term167582, term167582.getClass(), "day", (short) 11);
        setField(term167581, term167581.getClass(), "date", term167582);
        setByteField(term167586, term167586.getClass(), "hour", (byte) 18);
        setByteField(term167586, term167586.getClass(), "minute", (byte) 10);
        setByteField(term167586, term167586.getClass(), "second", (byte) 30);
        setIntField(term167586, term167586.getClass(), "nano", 924636047);
        setField(term167581, term167581.getClass(), "time", term167586);
        setField(term167555, term167555.getClass(), "accessTime", term167581);
        setField(term167553, term167553.getClass(), "card", term167555);
        setField(term167553, term167553.getClass(), "userName", "kIIognzCdz");
        setIntField(term167604, term167604.getClass(), "year", 2028);
        setShortField(term167604, term167604.getClass(), "month", (short) 3);
        setShortField(term167604, term167604.getClass(), "day", (short) 20);
        setField(term167603, term167603.getClass(), "date", term167604);
        setByteField(term167608, term167608.getClass(), "hour", (byte) 0);
        setByteField(term167608, term167608.getClass(), "minute", (byte) 36);
        setByteField(term167608, term167608.getClass(), "second", (byte) 54);
        setIntField(term167608, term167608.getClass(), "nano", 232348046);
        setField(term167603, term167603.getClass(), "time", term167608);
        setField(term167553, term167553.getClass(), "lastLoginDate", term167603);
        setBooleanField(term167553, term167553.getClass(), "isWebJoin", true);
        setField(term167553, term167553.getClass(), "webLimitDate", "urMZxEQIXl");
        setIntField(term167553, term167553.getClass(), "level", -186468784);
        setIntField(term167553, term167553.getClass(), "reincarnationNum", -126607040);
        setField(term167553, term167553.getClass(), "exp", "EoYFVoOjqB");
        setLongField(term167553, term167553.getClass(), "point", -5187413994592501672L);
        setLongField(term167553, term167553.getClass(), "totalPoint", 6101635617975429284L);
        setIntField(term167553, term167553.getClass(), "playCount", 270133587);
        setIntField(term167553, term167553.getClass(), "multiPlayCount", -559167477);
        setIntField(term167553, term167553.getClass(), "multiWinCount", -647004693);
        setIntField(term167553, term167553.getClass(), "requestResCount", -305072527);
        setIntField(term167553, term167553.getClass(), "acceptResCount", 159778089);
        setIntField(term167553, term167553.getClass(), "successResCount", -69519222);
        setIntField(term167553, term167553.getClass(), "playerRating", -711812997);
        setIntField(term167553, term167553.getClass(), "highestRating", 880677370);
        setIntField(term167553, term167553.getClass(), "nameplateId", 1062818301);
        setIntField(term167553, term167553.getClass(), "frameId", 1265936428);
        setIntField(term167553, term167553.getClass(), "characterId", 352976860);
        setIntField(term167553, term167553.getClass(), "trophyId", 1084007767);
        setIntField(term167553, term167553.getClass(), "playedTutorialBit", 1304651878);
        setIntField(term167553, term167553.getClass(), "firstTutorialCancelNum", 505920746);
        setIntField(term167553, term167553.getClass(), "masterTutorialCancelNum", -1636904784);
        setIntField(term167553, term167553.getClass(), "totalRepertoireCount", 323158291);
        setIntField(term167553, term167553.getClass(), "totalMapNum", 717803007);
        setLongField(term167553, term167553.getClass(), "totalHiScore", -8578947855341774832L);
        setLongField(term167553, term167553.getClass(), "totalBasicHighScore", 1002339845362412000L);
        setLongField(term167553, term167553.getClass(), "totalAdvancedHighScore", -9019732071183292416L);
        setLongField(term167553, term167553.getClass(), "totalExpertHighScore", 964480357268932511L);
        setLongField(term167553, term167553.getClass(), "totalMasterHighScore", -4250525757325272766L);
        setIntField(term167665, term167665.getClass(), "year", 2014);
        setShortField(term167665, term167665.getClass(), "month", (short) 7);
        setShortField(term167665, term167665.getClass(), "day", (short) 8);
        setField(term167664, term167664.getClass(), "date", term167665);
        setByteField(term167669, term167669.getClass(), "hour", (byte) 8);
        setByteField(term167669, term167669.getClass(), "minute", (byte) 7);
        setByteField(term167669, term167669.getClass(), "second", (byte) 15);
        setIntField(term167669, term167669.getClass(), "nano", 302747977);
        setField(term167664, term167664.getClass(), "time", term167669);
        setField(term167553, term167553.getClass(), "eventWatchedDate", term167664);
        setIntField(term167553, term167553.getClass(), "friendCount", -2028178818);
        setBooleanField(term167553, term167553.getClass(), "isMaimai", true);
        setField(term167553, term167553.getClass(), "firstGameId", "fWgDjgGWKF");
        setField(term167553, term167553.getClass(), "firstRomVersion", "KNErrLdCwq");
        setField(term167553, term167553.getClass(), "firstDataVersion", "IKFlEJMbOn");
        setIntField(term167713, term167713.getClass(), "year", 2018);
        setShortField(term167713, term167713.getClass(), "month", (short) 3);
        setShortField(term167713, term167713.getClass(), "day", (short) 20);
        setField(term167712, term167712.getClass(), "date", term167713);
        setByteField(term167717, term167717.getClass(), "hour", (byte) 12);
        setByteField(term167717, term167717.getClass(), "minute", (byte) 21);
        setByteField(term167717, term167717.getClass(), "second", (byte) 45);
        setIntField(term167717, term167717.getClass(), "nano", 248374500);
        setField(term167712, term167712.getClass(), "time", term167717);
        setField(term167553, term167553.getClass(), "firstPlayDate", term167712);
        setField(term167553, term167553.getClass(), "lastGameId", "aymyhPMjnn");
        setField(term167553, term167553.getClass(), "lastRomVersion", "aPlaqiCEzR");
        setField(term167553, term167553.getClass(), "lastDataVersion", "upFIfXmPHr");
        setIntField(term167759, term167759.getClass(), "year", 2029);
        setShortField(term167759, term167759.getClass(), "month", (short) 4);
        setShortField(term167759, term167759.getClass(), "day", (short) 27);
        setField(term167758, term167758.getClass(), "date", term167759);
        setByteField(term167763, term167763.getClass(), "hour", (byte) 6);
        setByteField(term167763, term167763.getClass(), "minute", (byte) 34);
        setByteField(term167763, term167763.getClass(), "second", (byte) 1);
        setIntField(term167763, term167763.getClass(), "nano", 973172241);
        setField(term167758, term167758.getClass(), "time", term167763);
        setField(term167553, term167553.getClass(), "lastPlayDate", term167758);
        setIntField(term167553, term167553.getClass(), "lastPlaceId", 1179208287);
        setField(term167553, term167553.getClass(), "lastPlaceName", "yWkVkdyYbu");
        setField(term167553, term167553.getClass(), "lastRegionId", "HKfJtemhMV");
        setField(term167553, term167553.getClass(), "lastRegionName", "GFuTvYNJGi");
        setField(term167553, term167553.getClass(), "lastAllNetId", "JgUbvEJCOI");
        setField(term167553, term167553.getClass(), "lastClientId", "ILpMVHBxyt");
        term167829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167834 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term167830, term167830.getClass(), "year", 2019);
        setShortField(term167830, term167830.getClass(), "month", (short) 2);
        setShortField(term167830, term167830.getClass(), "day", (short) 13);
        setField(term167829, term167829.getClass(), "date", term167830);
        setByteField(term167834, term167834.getClass(), "hour", (byte) 13);
        setByteField(term167834, term167834.getClass(), "minute", (byte) 37);
        setByteField(term167834, term167834.getClass(), "second", (byte) 40);
        setIntField(term167834, term167834.getClass(), "nano", 699397369);
        setField(term167829, term167829.getClass(), "time", term167834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term167829;
        callMethod(klass, "setFirstPlayDate", argTypes, term167553, args);
    }

};


