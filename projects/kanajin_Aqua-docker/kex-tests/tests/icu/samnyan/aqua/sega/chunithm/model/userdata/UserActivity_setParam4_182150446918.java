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

public class UserActivity_setParam4_182150446918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299668;
     Object term299953;

    public UserActivity_setParam4_182150446918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term299674 = new Long(-4029227951294167228L);
        term299668 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term299670 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term299672 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term299688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299693 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299703 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299834 = newInstance(Class.forName("java.time.LocalTime"));
        Object term299875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term299876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299880 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term299668, term299668.getClass(), "id", 2423688892717992709L);
        setLongField(term299670, term299670.getClass(), "id", 1193463649264461476L);
        setLongField(term299672, term299672.getClass(), "id", -8124321383672810307L);
        setField(term299672, term299672.getClass(), "extId", term299674);
        setField(term299672, term299672.getClass(), "luid", "bVOxJayYiq");
        setIntField(term299689, term299689.getClass(), "year", 2025);
        setShortField(term299689, term299689.getClass(), "month", (short) 5);
        setShortField(term299689, term299689.getClass(), "day", (short) 11);
        setField(term299688, term299688.getClass(), "date", term299689);
        setByteField(term299693, term299693.getClass(), "hour", (byte) 0);
        setByteField(term299693, term299693.getClass(), "minute", (byte) 23);
        setByteField(term299693, term299693.getClass(), "second", (byte) 24);
        setIntField(term299693, term299693.getClass(), "nano", 759762802);
        setField(term299688, term299688.getClass(), "time", term299693);
        setField(term299672, term299672.getClass(), "registerTime", term299688);
        setIntField(term299699, term299699.getClass(), "year", 2017);
        setShortField(term299699, term299699.getClass(), "month", (short) 8);
        setShortField(term299699, term299699.getClass(), "day", (short) 28);
        setField(term299698, term299698.getClass(), "date", term299699);
        setByteField(term299703, term299703.getClass(), "hour", (byte) 23);
        setByteField(term299703, term299703.getClass(), "minute", (byte) 14);
        setByteField(term299703, term299703.getClass(), "second", (byte) 26);
        setIntField(term299703, term299703.getClass(), "nano", 961482796);
        setField(term299698, term299698.getClass(), "time", term299703);
        setField(term299672, term299672.getClass(), "accessTime", term299698);
        setField(term299670, term299670.getClass(), "card", term299672);
        setField(term299670, term299670.getClass(), "userName", "qjysmKMiKT");
        setIntField(term299721, term299721.getClass(), "year", 2013);
        setShortField(term299721, term299721.getClass(), "month", (short) 9);
        setShortField(term299721, term299721.getClass(), "day", (short) 24);
        setField(term299720, term299720.getClass(), "date", term299721);
        setByteField(term299725, term299725.getClass(), "hour", (byte) 3);
        setByteField(term299725, term299725.getClass(), "minute", (byte) 13);
        setByteField(term299725, term299725.getClass(), "second", (byte) 36);
        setIntField(term299725, term299725.getClass(), "nano", 617123091);
        setField(term299720, term299720.getClass(), "time", term299725);
        setField(term299670, term299670.getClass(), "lastLoginDate", term299720);
        setBooleanField(term299670, term299670.getClass(), "isWebJoin", true);
        setField(term299670, term299670.getClass(), "webLimitDate", "IdvxsTXhfI");
        setIntField(term299670, term299670.getClass(), "level", -1983580842);
        setIntField(term299670, term299670.getClass(), "reincarnationNum", 1331277023);
        setField(term299670, term299670.getClass(), "exp", "dqJbExUvup");
        setLongField(term299670, term299670.getClass(), "point", 4993477776202138429L);
        setLongField(term299670, term299670.getClass(), "totalPoint", 8876040618875695654L);
        setIntField(term299670, term299670.getClass(), "playCount", 947611688);
        setIntField(term299670, term299670.getClass(), "multiPlayCount", -1159146752);
        setIntField(term299670, term299670.getClass(), "multiWinCount", -1065436081);
        setIntField(term299670, term299670.getClass(), "requestResCount", 971019069);
        setIntField(term299670, term299670.getClass(), "acceptResCount", -1099401229);
        setIntField(term299670, term299670.getClass(), "successResCount", 709838754);
        setIntField(term299670, term299670.getClass(), "playerRating", -85093106);
        setIntField(term299670, term299670.getClass(), "highestRating", -1698754374);
        setIntField(term299670, term299670.getClass(), "nameplateId", 1846632663);
        setIntField(term299670, term299670.getClass(), "frameId", -1288250590);
        setIntField(term299670, term299670.getClass(), "characterId", -1808201152);
        setIntField(term299670, term299670.getClass(), "trophyId", -529949642);
        setIntField(term299670, term299670.getClass(), "playedTutorialBit", -76656882);
        setIntField(term299670, term299670.getClass(), "firstTutorialCancelNum", 987800835);
        setIntField(term299670, term299670.getClass(), "masterTutorialCancelNum", 1029114126);
        setIntField(term299670, term299670.getClass(), "totalRepertoireCount", 2061594658);
        setIntField(term299670, term299670.getClass(), "totalMapNum", 1057921399);
        setLongField(term299670, term299670.getClass(), "totalHiScore", -6458700098821180318L);
        setLongField(term299670, term299670.getClass(), "totalBasicHighScore", -3334548350133176640L);
        setLongField(term299670, term299670.getClass(), "totalAdvancedHighScore", -5615890364768347380L);
        setLongField(term299670, term299670.getClass(), "totalExpertHighScore", -5910591894509032598L);
        setLongField(term299670, term299670.getClass(), "totalMasterHighScore", -60355402767553960L);
        setIntField(term299782, term299782.getClass(), "year", 2026);
        setShortField(term299782, term299782.getClass(), "month", (short) 10);
        setShortField(term299782, term299782.getClass(), "day", (short) 13);
        setField(term299781, term299781.getClass(), "date", term299782);
        setByteField(term299786, term299786.getClass(), "hour", (byte) 14);
        setByteField(term299786, term299786.getClass(), "minute", (byte) 42);
        setByteField(term299786, term299786.getClass(), "second", (byte) 28);
        setIntField(term299786, term299786.getClass(), "nano", 125118770);
        setField(term299781, term299781.getClass(), "time", term299786);
        setField(term299670, term299670.getClass(), "eventWatchedDate", term299781);
        setIntField(term299670, term299670.getClass(), "friendCount", 1860531765);
        setBooleanField(term299670, term299670.getClass(), "isMaimai", true);
        setField(term299670, term299670.getClass(), "firstGameId", "TcgeOuVhBl");
        setField(term299670, term299670.getClass(), "firstRomVersion", "EsGOUSyjcl");
        setField(term299670, term299670.getClass(), "firstDataVersion", "MrcebsjLJc");
        setIntField(term299830, term299830.getClass(), "year", 2028);
        setShortField(term299830, term299830.getClass(), "month", (short) 5);
        setShortField(term299830, term299830.getClass(), "day", (short) 23);
        setField(term299829, term299829.getClass(), "date", term299830);
        setByteField(term299834, term299834.getClass(), "hour", (byte) 14);
        setByteField(term299834, term299834.getClass(), "minute", (byte) 33);
        setByteField(term299834, term299834.getClass(), "second", (byte) 28);
        setIntField(term299834, term299834.getClass(), "nano", 796927797);
        setField(term299829, term299829.getClass(), "time", term299834);
        setField(term299670, term299670.getClass(), "firstPlayDate", term299829);
        setField(term299670, term299670.getClass(), "lastGameId", "WsgiRfUyFt");
        setField(term299670, term299670.getClass(), "lastRomVersion", "UeuvnYQTzK");
        setField(term299670, term299670.getClass(), "lastDataVersion", "WIRsSxDEcQ");
        setIntField(term299876, term299876.getClass(), "year", 2023);
        setShortField(term299876, term299876.getClass(), "month", (short) 3);
        setShortField(term299876, term299876.getClass(), "day", (short) 8);
        setField(term299875, term299875.getClass(), "date", term299876);
        setByteField(term299880, term299880.getClass(), "hour", (byte) 12);
        setByteField(term299880, term299880.getClass(), "minute", (byte) 18);
        setByteField(term299880, term299880.getClass(), "second", (byte) 15);
        setIntField(term299880, term299880.getClass(), "nano", 807597371);
        setField(term299875, term299875.getClass(), "time", term299880);
        setField(term299670, term299670.getClass(), "lastPlayDate", term299875);
        setIntField(term299670, term299670.getClass(), "lastPlaceId", 1900045950);
        setField(term299670, term299670.getClass(), "lastPlaceName", "gktMmpIJGy");
        setField(term299670, term299670.getClass(), "lastRegionId", "yEUvvkNsJL");
        setField(term299670, term299670.getClass(), "lastRegionName", "LeUPMkvgXk");
        setField(term299670, term299670.getClass(), "lastAllNetId", "fiZsddQQDN");
        setField(term299670, term299670.getClass(), "lastClientId", "qngJBSwcWS");
        setField(term299668, term299668.getClass(), "user", term299670);
        setIntField(term299668, term299668.getClass(), "kind", 907619854);
        setIntField(term299668, term299668.getClass(), "activityId", 1107910554);
        setIntField(term299668, term299668.getClass(), "sortNumber", 778090701);
        setIntField(term299668, term299668.getClass(), "param1", 320722712);
        setIntField(term299668, term299668.getClass(), "param2", 2093459327);
        setIntField(term299668, term299668.getClass(), "param3", 229344233);
        setIntField(term299668, term299668.getClass(), "param4", -1916987656);
        term299953 = new Integer(1801075916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term299953;
        callMethod(klass, "setParam4", argTypes, term299668, args);
    }

};


