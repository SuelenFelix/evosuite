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

public class UserGameOptionEx_setExt16_36869552540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327961;
     Object term328259;

    public UserGameOptionEx_setExt16_36869552540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term327967 = new Long(-7717027128782374599L);
        term327961 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term327963 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term327965 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term327981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327996 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328018 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328074 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328075 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328079 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term328168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term328169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328173 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term327961, term327961.getClass(), "id", -3931041430901886981L);
        setLongField(term327963, term327963.getClass(), "id", -5052135911483840566L);
        setLongField(term327965, term327965.getClass(), "id", 7782854995772117469L);
        setField(term327965, term327965.getClass(), "extId", term327967);
        setField(term327965, term327965.getClass(), "luid", "ibSKpbaZQm");
        setIntField(term327982, term327982.getClass(), "year", 2023);
        setShortField(term327982, term327982.getClass(), "month", (short) 3);
        setShortField(term327982, term327982.getClass(), "day", (short) 13);
        setField(term327981, term327981.getClass(), "date", term327982);
        setByteField(term327986, term327986.getClass(), "hour", (byte) 20);
        setByteField(term327986, term327986.getClass(), "minute", (byte) 28);
        setByteField(term327986, term327986.getClass(), "second", (byte) 11);
        setIntField(term327986, term327986.getClass(), "nano", 265278671);
        setField(term327981, term327981.getClass(), "time", term327986);
        setField(term327965, term327965.getClass(), "registerTime", term327981);
        setIntField(term327992, term327992.getClass(), "year", 2020);
        setShortField(term327992, term327992.getClass(), "month", (short) 5);
        setShortField(term327992, term327992.getClass(), "day", (short) 21);
        setField(term327991, term327991.getClass(), "date", term327992);
        setByteField(term327996, term327996.getClass(), "hour", (byte) 20);
        setByteField(term327996, term327996.getClass(), "minute", (byte) 51);
        setByteField(term327996, term327996.getClass(), "second", (byte) 48);
        setIntField(term327996, term327996.getClass(), "nano", 960136036);
        setField(term327991, term327991.getClass(), "time", term327996);
        setField(term327965, term327965.getClass(), "accessTime", term327991);
        setField(term327963, term327963.getClass(), "card", term327965);
        setField(term327963, term327963.getClass(), "userName", "CZJQXVRezG");
        setIntField(term328014, term328014.getClass(), "year", 2016);
        setShortField(term328014, term328014.getClass(), "month", (short) 4);
        setShortField(term328014, term328014.getClass(), "day", (short) 18);
        setField(term328013, term328013.getClass(), "date", term328014);
        setByteField(term328018, term328018.getClass(), "hour", (byte) 20);
        setByteField(term328018, term328018.getClass(), "minute", (byte) 16);
        setByteField(term328018, term328018.getClass(), "second", (byte) 1);
        setIntField(term328018, term328018.getClass(), "nano", 13958406);
        setField(term328013, term328013.getClass(), "time", term328018);
        setField(term327963, term327963.getClass(), "lastLoginDate", term328013);
        setBooleanField(term327963, term327963.getClass(), "isWebJoin", false);
        setField(term327963, term327963.getClass(), "webLimitDate", "VwDwhvfpUt");
        setIntField(term327963, term327963.getClass(), "level", 1669987326);
        setIntField(term327963, term327963.getClass(), "reincarnationNum", -528961043);
        setField(term327963, term327963.getClass(), "exp", "zuITAkOWOf");
        setLongField(term327963, term327963.getClass(), "point", -4482026236867875918L);
        setLongField(term327963, term327963.getClass(), "totalPoint", 3980744608339083800L);
        setIntField(term327963, term327963.getClass(), "playCount", -1221068398);
        setIntField(term327963, term327963.getClass(), "multiPlayCount", -1431603634);
        setIntField(term327963, term327963.getClass(), "multiWinCount", -2145618978);
        setIntField(term327963, term327963.getClass(), "requestResCount", -2072742962);
        setIntField(term327963, term327963.getClass(), "acceptResCount", 1926004382);
        setIntField(term327963, term327963.getClass(), "successResCount", 162454064);
        setIntField(term327963, term327963.getClass(), "playerRating", 935531911);
        setIntField(term327963, term327963.getClass(), "highestRating", 1832818618);
        setIntField(term327963, term327963.getClass(), "nameplateId", -85694964);
        setIntField(term327963, term327963.getClass(), "frameId", 1708019769);
        setIntField(term327963, term327963.getClass(), "characterId", -1917518407);
        setIntField(term327963, term327963.getClass(), "trophyId", -1540625466);
        setIntField(term327963, term327963.getClass(), "playedTutorialBit", 1722245644);
        setIntField(term327963, term327963.getClass(), "firstTutorialCancelNum", -1199651827);
        setIntField(term327963, term327963.getClass(), "masterTutorialCancelNum", -803625753);
        setIntField(term327963, term327963.getClass(), "totalRepertoireCount", -456062941);
        setIntField(term327963, term327963.getClass(), "totalMapNum", 1992286479);
        setLongField(term327963, term327963.getClass(), "totalHiScore", -5514455953680227693L);
        setLongField(term327963, term327963.getClass(), "totalBasicHighScore", -3285774727775346120L);
        setLongField(term327963, term327963.getClass(), "totalAdvancedHighScore", 2907673097447522431L);
        setLongField(term327963, term327963.getClass(), "totalExpertHighScore", -7550281487458806119L);
        setLongField(term327963, term327963.getClass(), "totalMasterHighScore", -4449926577327941560L);
        setIntField(term328075, term328075.getClass(), "year", 2017);
        setShortField(term328075, term328075.getClass(), "month", (short) 10);
        setShortField(term328075, term328075.getClass(), "day", (short) 4);
        setField(term328074, term328074.getClass(), "date", term328075);
        setByteField(term328079, term328079.getClass(), "hour", (byte) 19);
        setByteField(term328079, term328079.getClass(), "minute", (byte) 34);
        setByteField(term328079, term328079.getClass(), "second", (byte) 34);
        setIntField(term328079, term328079.getClass(), "nano", 363769382);
        setField(term328074, term328074.getClass(), "time", term328079);
        setField(term327963, term327963.getClass(), "eventWatchedDate", term328074);
        setIntField(term327963, term327963.getClass(), "friendCount", 532415022);
        setBooleanField(term327963, term327963.getClass(), "isMaimai", false);
        setField(term327963, term327963.getClass(), "firstGameId", "nOhUUQmwkx");
        setField(term327963, term327963.getClass(), "firstRomVersion", "qcsCzZuHeB");
        setField(term327963, term327963.getClass(), "firstDataVersion", "fwIkwuYcQV");
        setIntField(term328123, term328123.getClass(), "year", 2022);
        setShortField(term328123, term328123.getClass(), "month", (short) 9);
        setShortField(term328123, term328123.getClass(), "day", (short) 6);
        setField(term328122, term328122.getClass(), "date", term328123);
        setByteField(term328127, term328127.getClass(), "hour", (byte) 23);
        setByteField(term328127, term328127.getClass(), "minute", (byte) 59);
        setByteField(term328127, term328127.getClass(), "second", (byte) 17);
        setIntField(term328127, term328127.getClass(), "nano", 113785945);
        setField(term328122, term328122.getClass(), "time", term328127);
        setField(term327963, term327963.getClass(), "firstPlayDate", term328122);
        setField(term327963, term327963.getClass(), "lastGameId", "zAFuEpkxLv");
        setField(term327963, term327963.getClass(), "lastRomVersion", "yBJjVTlfhB");
        setField(term327963, term327963.getClass(), "lastDataVersion", "HVNrCVKJTz");
        setIntField(term328169, term328169.getClass(), "year", 2014);
        setShortField(term328169, term328169.getClass(), "month", (short) 10);
        setShortField(term328169, term328169.getClass(), "day", (short) 8);
        setField(term328168, term328168.getClass(), "date", term328169);
        setByteField(term328173, term328173.getClass(), "hour", (byte) 4);
        setByteField(term328173, term328173.getClass(), "minute", (byte) 33);
        setByteField(term328173, term328173.getClass(), "second", (byte) 39);
        setIntField(term328173, term328173.getClass(), "nano", 175604682);
        setField(term328168, term328168.getClass(), "time", term328173);
        setField(term327963, term327963.getClass(), "lastPlayDate", term328168);
        setIntField(term327963, term327963.getClass(), "lastPlaceId", -1272300450);
        setField(term327963, term327963.getClass(), "lastPlaceName", "yEAAxXLmqa");
        setField(term327963, term327963.getClass(), "lastRegionId", "eqdadDiwzd");
        setField(term327963, term327963.getClass(), "lastRegionName", "tFYLzTDneK");
        setField(term327963, term327963.getClass(), "lastAllNetId", "IwWOTOxIFe");
        setField(term327963, term327963.getClass(), "lastClientId", "hQbREUtOdY");
        setField(term327961, term327961.getClass(), "user", term327963);
        setIntField(term327961, term327961.getClass(), "ext1", -1508552849);
        setIntField(term327961, term327961.getClass(), "ext2", -1439848054);
        setIntField(term327961, term327961.getClass(), "ext3", -2074664341);
        setIntField(term327961, term327961.getClass(), "ext4", 1411987884);
        setIntField(term327961, term327961.getClass(), "ext5", -603643833);
        setIntField(term327961, term327961.getClass(), "ext6", -1447039495);
        setIntField(term327961, term327961.getClass(), "ext7", -157506155);
        setIntField(term327961, term327961.getClass(), "ext8", 1522316351);
        setIntField(term327961, term327961.getClass(), "ext9", 681380896);
        setIntField(term327961, term327961.getClass(), "ext10", 89005350);
        setIntField(term327961, term327961.getClass(), "ext11", 1095907961);
        setIntField(term327961, term327961.getClass(), "ext12", -1059161781);
        setIntField(term327961, term327961.getClass(), "ext13", 2064721751);
        setIntField(term327961, term327961.getClass(), "ext14", 1098314410);
        setIntField(term327961, term327961.getClass(), "ext15", 513236489);
        setIntField(term327961, term327961.getClass(), "ext16", -379651599);
        setIntField(term327961, term327961.getClass(), "ext17", 699451013);
        setIntField(term327961, term327961.getClass(), "ext18", -618558540);
        setIntField(term327961, term327961.getClass(), "ext19", -885830948);
        setIntField(term327961, term327961.getClass(), "ext20", -1255770211);
        term328259 = new Integer(-1011335912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term328259;
        callMethod(klass, "setExt16", argTypes, term327961, args);
    }

};


