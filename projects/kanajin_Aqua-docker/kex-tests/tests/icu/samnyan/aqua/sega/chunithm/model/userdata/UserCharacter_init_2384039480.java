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

public class UserCharacter_init_2384039480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108045;

    public UserCharacter_init_2384039480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108049 = new Long(-3954795081650780841L);
        term108045 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term108047 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108068 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108078 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108100 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108209 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108255 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108045, term108045.getClass(), "id", 7405337470806099590L);
        setLongField(term108047, term108047.getClass(), "id", 7098365422551787072L);
        setField(term108047, term108047.getClass(), "extId", term108049);
        setField(term108047, term108047.getClass(), "luid", "VRKEuPftph");
        setIntField(term108064, term108064.getClass(), "year", 2011);
        setShortField(term108064, term108064.getClass(), "month", (short) 5);
        setShortField(term108064, term108064.getClass(), "day", (short) 30);
        setField(term108063, term108063.getClass(), "date", term108064);
        setByteField(term108068, term108068.getClass(), "hour", (byte) 9);
        setByteField(term108068, term108068.getClass(), "minute", (byte) 57);
        setByteField(term108068, term108068.getClass(), "second", (byte) 16);
        setIntField(term108068, term108068.getClass(), "nano", 713626651);
        setField(term108063, term108063.getClass(), "time", term108068);
        setField(term108047, term108047.getClass(), "registerTime", term108063);
        setIntField(term108074, term108074.getClass(), "year", 2025);
        setShortField(term108074, term108074.getClass(), "month", (short) 6);
        setShortField(term108074, term108074.getClass(), "day", (short) 6);
        setField(term108073, term108073.getClass(), "date", term108074);
        setByteField(term108078, term108078.getClass(), "hour", (byte) 11);
        setByteField(term108078, term108078.getClass(), "minute", (byte) 28);
        setByteField(term108078, term108078.getClass(), "second", (byte) 1);
        setIntField(term108078, term108078.getClass(), "nano", 731901784);
        setField(term108073, term108073.getClass(), "time", term108078);
        setField(term108047, term108047.getClass(), "accessTime", term108073);
        setField(term108045, term108045.getClass(), "card", term108047);
        setField(term108045, term108045.getClass(), "userName", "DkRegMkIWt");
        setIntField(term108096, term108096.getClass(), "year", 2028);
        setShortField(term108096, term108096.getClass(), "month", (short) 8);
        setShortField(term108096, term108096.getClass(), "day", (short) 27);
        setField(term108095, term108095.getClass(), "date", term108096);
        setByteField(term108100, term108100.getClass(), "hour", (byte) 5);
        setByteField(term108100, term108100.getClass(), "minute", (byte) 50);
        setByteField(term108100, term108100.getClass(), "second", (byte) 39);
        setIntField(term108100, term108100.getClass(), "nano", 53415756);
        setField(term108095, term108095.getClass(), "time", term108100);
        setField(term108045, term108045.getClass(), "lastLoginDate", term108095);
        setBooleanField(term108045, term108045.getClass(), "isWebJoin", true);
        setField(term108045, term108045.getClass(), "webLimitDate", "IIOFAGjcXe");
        setIntField(term108045, term108045.getClass(), "level", -324420288);
        setIntField(term108045, term108045.getClass(), "reincarnationNum", -327505418);
        setField(term108045, term108045.getClass(), "exp", "XsAUdWVfqM");
        setLongField(term108045, term108045.getClass(), "point", 2683449026393099745L);
        setLongField(term108045, term108045.getClass(), "totalPoint", 5966731553888818893L);
        setIntField(term108045, term108045.getClass(), "playCount", -345983538);
        setIntField(term108045, term108045.getClass(), "multiPlayCount", 1910809114);
        setIntField(term108045, term108045.getClass(), "multiWinCount", 1217723895);
        setIntField(term108045, term108045.getClass(), "requestResCount", -907902250);
        setIntField(term108045, term108045.getClass(), "acceptResCount", -286413213);
        setIntField(term108045, term108045.getClass(), "successResCount", 389597623);
        setIntField(term108045, term108045.getClass(), "playerRating", 1355618501);
        setIntField(term108045, term108045.getClass(), "highestRating", -804557100);
        setIntField(term108045, term108045.getClass(), "nameplateId", -208537609);
        setIntField(term108045, term108045.getClass(), "frameId", 2077395924);
        setIntField(term108045, term108045.getClass(), "characterId", 415308572);
        setIntField(term108045, term108045.getClass(), "trophyId", -1042999942);
        setIntField(term108045, term108045.getClass(), "playedTutorialBit", 154667804);
        setIntField(term108045, term108045.getClass(), "firstTutorialCancelNum", 45779305);
        setIntField(term108045, term108045.getClass(), "masterTutorialCancelNum", -743067909);
        setIntField(term108045, term108045.getClass(), "totalRepertoireCount", -361714184);
        setIntField(term108045, term108045.getClass(), "totalMapNum", -1401087276);
        setLongField(term108045, term108045.getClass(), "totalHiScore", -8607443959885285191L);
        setLongField(term108045, term108045.getClass(), "totalBasicHighScore", 5658001480414187301L);
        setLongField(term108045, term108045.getClass(), "totalAdvancedHighScore", -3320854059921237888L);
        setLongField(term108045, term108045.getClass(), "totalExpertHighScore", 516977411185784220L);
        setLongField(term108045, term108045.getClass(), "totalMasterHighScore", -7738436979075632041L);
        setIntField(term108157, term108157.getClass(), "year", 2015);
        setShortField(term108157, term108157.getClass(), "month", (short) 3);
        setShortField(term108157, term108157.getClass(), "day", (short) 11);
        setField(term108156, term108156.getClass(), "date", term108157);
        setByteField(term108161, term108161.getClass(), "hour", (byte) 23);
        setByteField(term108161, term108161.getClass(), "minute", (byte) 11);
        setByteField(term108161, term108161.getClass(), "second", (byte) 50);
        setIntField(term108161, term108161.getClass(), "nano", 517297304);
        setField(term108156, term108156.getClass(), "time", term108161);
        setField(term108045, term108045.getClass(), "eventWatchedDate", term108156);
        setIntField(term108045, term108045.getClass(), "friendCount", -2103330738);
        setBooleanField(term108045, term108045.getClass(), "isMaimai", true);
        setField(term108045, term108045.getClass(), "firstGameId", "WRKAHqtTqT");
        setField(term108045, term108045.getClass(), "firstRomVersion", "EkgwvUqGYF");
        setField(term108045, term108045.getClass(), "firstDataVersion", "sbtPNrurvf");
        setIntField(term108205, term108205.getClass(), "year", 2020);
        setShortField(term108205, term108205.getClass(), "month", (short) 2);
        setShortField(term108205, term108205.getClass(), "day", (short) 1);
        setField(term108204, term108204.getClass(), "date", term108205);
        setByteField(term108209, term108209.getClass(), "hour", (byte) 14);
        setByteField(term108209, term108209.getClass(), "minute", (byte) 4);
        setByteField(term108209, term108209.getClass(), "second", (byte) 34);
        setIntField(term108209, term108209.getClass(), "nano", 839771089);
        setField(term108204, term108204.getClass(), "time", term108209);
        setField(term108045, term108045.getClass(), "firstPlayDate", term108204);
        setField(term108045, term108045.getClass(), "lastGameId", "zomtOAIouP");
        setField(term108045, term108045.getClass(), "lastRomVersion", "pwHkUmkBGN");
        setField(term108045, term108045.getClass(), "lastDataVersion", "TZJzEpeSDz");
        setIntField(term108251, term108251.getClass(), "year", 2019);
        setShortField(term108251, term108251.getClass(), "month", (short) 7);
        setShortField(term108251, term108251.getClass(), "day", (short) 22);
        setField(term108250, term108250.getClass(), "date", term108251);
        setByteField(term108255, term108255.getClass(), "hour", (byte) 11);
        setByteField(term108255, term108255.getClass(), "minute", (byte) 35);
        setByteField(term108255, term108255.getClass(), "second", (byte) 6);
        setIntField(term108255, term108255.getClass(), "nano", 143847417);
        setField(term108250, term108250.getClass(), "time", term108255);
        setField(term108045, term108045.getClass(), "lastPlayDate", term108250);
        setIntField(term108045, term108045.getClass(), "lastPlaceId", 1748913795);
        setField(term108045, term108045.getClass(), "lastPlaceName", "CEVnfPOBDk");
        setField(term108045, term108045.getClass(), "lastRegionId", "JUpDTRXGtv");
        setField(term108045, term108045.getClass(), "lastRegionName", "cKBnwzMCia");
        setField(term108045, term108045.getClass(), "lastAllNetId", "QWmZpWASOK");
        setField(term108045, term108045.getClass(), "lastClientId", "ZNLWGsxniS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term108045;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


