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

public class UserGameOption_getJudgePos_72103249511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53671;

    public UserGameOption_getJudgePos_72103249511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53677 = new Long(6689117472719450333L);
        term53671 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term53673 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term53675 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term53691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53706 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53784 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53785 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53789 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53837 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53878 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53883 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term53671, term53671.getClass(), "id", 7437006125284633666L);
        setLongField(term53673, term53673.getClass(), "id", 7426144489061842120L);
        setLongField(term53675, term53675.getClass(), "id", -7501037219137334101L);
        setField(term53675, term53675.getClass(), "extId", term53677);
        setField(term53675, term53675.getClass(), "luid", "NeEetzFhTt");
        setIntField(term53692, term53692.getClass(), "year", 2017);
        setShortField(term53692, term53692.getClass(), "month", (short) 10);
        setShortField(term53692, term53692.getClass(), "day", (short) 10);
        setField(term53691, term53691.getClass(), "date", term53692);
        setByteField(term53696, term53696.getClass(), "hour", (byte) 18);
        setByteField(term53696, term53696.getClass(), "minute", (byte) 16);
        setByteField(term53696, term53696.getClass(), "second", (byte) 29);
        setIntField(term53696, term53696.getClass(), "nano", 468943994);
        setField(term53691, term53691.getClass(), "time", term53696);
        setField(term53675, term53675.getClass(), "registerTime", term53691);
        setIntField(term53702, term53702.getClass(), "year", 2029);
        setShortField(term53702, term53702.getClass(), "month", (short) 3);
        setShortField(term53702, term53702.getClass(), "day", (short) 21);
        setField(term53701, term53701.getClass(), "date", term53702);
        setByteField(term53706, term53706.getClass(), "hour", (byte) 12);
        setByteField(term53706, term53706.getClass(), "minute", (byte) 42);
        setByteField(term53706, term53706.getClass(), "second", (byte) 52);
        setIntField(term53706, term53706.getClass(), "nano", 391302765);
        setField(term53701, term53701.getClass(), "time", term53706);
        setField(term53675, term53675.getClass(), "accessTime", term53701);
        setField(term53673, term53673.getClass(), "card", term53675);
        setField(term53673, term53673.getClass(), "userName", "UgvuvUxKed");
        setIntField(term53724, term53724.getClass(), "year", 2019);
        setShortField(term53724, term53724.getClass(), "month", (short) 10);
        setShortField(term53724, term53724.getClass(), "day", (short) 4);
        setField(term53723, term53723.getClass(), "date", term53724);
        setByteField(term53728, term53728.getClass(), "hour", (byte) 14);
        setByteField(term53728, term53728.getClass(), "minute", (byte) 11);
        setByteField(term53728, term53728.getClass(), "second", (byte) 28);
        setIntField(term53728, term53728.getClass(), "nano", 963604727);
        setField(term53723, term53723.getClass(), "time", term53728);
        setField(term53673, term53673.getClass(), "lastLoginDate", term53723);
        setBooleanField(term53673, term53673.getClass(), "isWebJoin", false);
        setField(term53673, term53673.getClass(), "webLimitDate", "ljBBMsQpaM");
        setIntField(term53673, term53673.getClass(), "level", 692290973);
        setIntField(term53673, term53673.getClass(), "reincarnationNum", 344667712);
        setField(term53673, term53673.getClass(), "exp", "hHNIOlOzJc");
        setLongField(term53673, term53673.getClass(), "point", -5898738968422709494L);
        setLongField(term53673, term53673.getClass(), "totalPoint", 1222571199408067081L);
        setIntField(term53673, term53673.getClass(), "playCount", 921447346);
        setIntField(term53673, term53673.getClass(), "multiPlayCount", 1514227664);
        setIntField(term53673, term53673.getClass(), "multiWinCount", 2000874140);
        setIntField(term53673, term53673.getClass(), "requestResCount", -701728269);
        setIntField(term53673, term53673.getClass(), "acceptResCount", -1094813190);
        setIntField(term53673, term53673.getClass(), "successResCount", -355401879);
        setIntField(term53673, term53673.getClass(), "playerRating", -1878519758);
        setIntField(term53673, term53673.getClass(), "highestRating", -214099950);
        setIntField(term53673, term53673.getClass(), "nameplateId", -1324210306);
        setIntField(term53673, term53673.getClass(), "frameId", -1148507981);
        setIntField(term53673, term53673.getClass(), "characterId", 149806587);
        setIntField(term53673, term53673.getClass(), "trophyId", 2030509680);
        setIntField(term53673, term53673.getClass(), "playedTutorialBit", -927217294);
        setIntField(term53673, term53673.getClass(), "firstTutorialCancelNum", -157082836);
        setIntField(term53673, term53673.getClass(), "masterTutorialCancelNum", 1665464572);
        setIntField(term53673, term53673.getClass(), "totalRepertoireCount", -685125586);
        setIntField(term53673, term53673.getClass(), "totalMapNum", 708362673);
        setLongField(term53673, term53673.getClass(), "totalHiScore", -3672309483214533219L);
        setLongField(term53673, term53673.getClass(), "totalBasicHighScore", -2448708288718122671L);
        setLongField(term53673, term53673.getClass(), "totalAdvancedHighScore", 7391856662550454315L);
        setLongField(term53673, term53673.getClass(), "totalExpertHighScore", -6573442531269156325L);
        setLongField(term53673, term53673.getClass(), "totalMasterHighScore", -2326118746160954215L);
        setIntField(term53785, term53785.getClass(), "year", 2029);
        setShortField(term53785, term53785.getClass(), "month", (short) 8);
        setShortField(term53785, term53785.getClass(), "day", (short) 18);
        setField(term53784, term53784.getClass(), "date", term53785);
        setByteField(term53789, term53789.getClass(), "hour", (byte) 8);
        setByteField(term53789, term53789.getClass(), "minute", (byte) 52);
        setByteField(term53789, term53789.getClass(), "second", (byte) 59);
        setIntField(term53789, term53789.getClass(), "nano", 526040172);
        setField(term53784, term53784.getClass(), "time", term53789);
        setField(term53673, term53673.getClass(), "eventWatchedDate", term53784);
        setIntField(term53673, term53673.getClass(), "friendCount", -630444357);
        setBooleanField(term53673, term53673.getClass(), "isMaimai", true);
        setField(term53673, term53673.getClass(), "firstGameId", "ALRSeULyWV");
        setField(term53673, term53673.getClass(), "firstRomVersion", "WVhzXHdyFF");
        setField(term53673, term53673.getClass(), "firstDataVersion", "GLAWYoxkyw");
        setIntField(term53833, term53833.getClass(), "year", 2013);
        setShortField(term53833, term53833.getClass(), "month", (short) 12);
        setShortField(term53833, term53833.getClass(), "day", (short) 7);
        setField(term53832, term53832.getClass(), "date", term53833);
        setByteField(term53837, term53837.getClass(), "hour", (byte) 15);
        setByteField(term53837, term53837.getClass(), "minute", (byte) 56);
        setByteField(term53837, term53837.getClass(), "second", (byte) 2);
        setIntField(term53837, term53837.getClass(), "nano", 550722676);
        setField(term53832, term53832.getClass(), "time", term53837);
        setField(term53673, term53673.getClass(), "firstPlayDate", term53832);
        setField(term53673, term53673.getClass(), "lastGameId", "cfpPTNNVnW");
        setField(term53673, term53673.getClass(), "lastRomVersion", "VPkEFShMUB");
        setField(term53673, term53673.getClass(), "lastDataVersion", "ZIgHysIFcL");
        setIntField(term53879, term53879.getClass(), "year", 2014);
        setShortField(term53879, term53879.getClass(), "month", (short) 7);
        setShortField(term53879, term53879.getClass(), "day", (short) 18);
        setField(term53878, term53878.getClass(), "date", term53879);
        setByteField(term53883, term53883.getClass(), "hour", (byte) 19);
        setByteField(term53883, term53883.getClass(), "minute", (byte) 34);
        setByteField(term53883, term53883.getClass(), "second", (byte) 55);
        setIntField(term53883, term53883.getClass(), "nano", 945082868);
        setField(term53878, term53878.getClass(), "time", term53883);
        setField(term53673, term53673.getClass(), "lastPlayDate", term53878);
        setIntField(term53673, term53673.getClass(), "lastPlaceId", 936421624);
        setField(term53673, term53673.getClass(), "lastPlaceName", "ofSfQtWBjp");
        setField(term53673, term53673.getClass(), "lastRegionId", "vkbIpZOlcY");
        setField(term53673, term53673.getClass(), "lastRegionName", "XbAeosZekH");
        setField(term53673, term53673.getClass(), "lastAllNetId", "EvGPvjswTz");
        setField(term53673, term53673.getClass(), "lastClientId", "lbnnCkEZgE");
        setField(term53671, term53671.getClass(), "user", term53673);
        setIntField(term53671, term53671.getClass(), "bgInfo", -616512894);
        setIntField(term53671, term53671.getClass(), "fieldColor", 710841913);
        setIntField(term53671, term53671.getClass(), "guideSound", 293875732);
        setIntField(term53671, term53671.getClass(), "soundEffect", -375636222);
        setIntField(term53671, term53671.getClass(), "guideLine", 2019131833);
        setIntField(term53671, term53671.getClass(), "speed", -2057057319);
        setIntField(term53671, term53671.getClass(), "optionSet", -872007840);
        setIntField(term53671, term53671.getClass(), "matching", 614977875);
        setIntField(term53671, term53671.getClass(), "judgePos", -424672642);
        setIntField(term53671, term53671.getClass(), "rating", -1836107736);
        setIntField(term53671, term53671.getClass(), "judgeJustice", 1774306588);
        setIntField(term53671, term53671.getClass(), "judgeAttack", 897867869);
        setIntField(term53671, term53671.getClass(), "headphone", -1058380964);
        setIntField(term53671, term53671.getClass(), "playerLevel", 1144389305);
        setIntField(term53671, term53671.getClass(), "successTap", 785140032);
        setIntField(term53671, term53671.getClass(), "successExTap", 2011478303);
        setIntField(term53671, term53671.getClass(), "successSlideHold", -1064254847);
        setIntField(term53671, term53671.getClass(), "successAir", 427797900);
        setIntField(term53671, term53671.getClass(), "successFlick", 948009124);
        setIntField(term53671, term53671.getClass(), "successSkill", 1688840379);
        setIntField(term53671, term53671.getClass(), "successTapTimbre", -1811534908);
        setIntField(term53671, term53671.getClass(), "privacy", -1024774970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgePos", argTypes, term53671, args);
    }

};


