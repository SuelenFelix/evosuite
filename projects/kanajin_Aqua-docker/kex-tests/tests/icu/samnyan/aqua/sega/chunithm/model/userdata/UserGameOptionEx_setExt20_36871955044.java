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

public class UserGameOptionEx_setExt20_36871955044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329761;
     Object term330059;

    public UserGameOptionEx_setExt20_36871955044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term329767 = new Long(675601558105654203L);
        term329761 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term329763 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term329765 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term329781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329796 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329818 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329879 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329927 = newInstance(Class.forName("java.time.LocalTime"));
        Object term329968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term329969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term329973 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term329761, term329761.getClass(), "id", 2198010427584003004L);
        setLongField(term329763, term329763.getClass(), "id", -443151478836115409L);
        setLongField(term329765, term329765.getClass(), "id", 9087586494678498141L);
        setField(term329765, term329765.getClass(), "extId", term329767);
        setField(term329765, term329765.getClass(), "luid", "qJrFbnMItH");
        setIntField(term329782, term329782.getClass(), "year", 2017);
        setShortField(term329782, term329782.getClass(), "month", (short) 3);
        setShortField(term329782, term329782.getClass(), "day", (short) 26);
        setField(term329781, term329781.getClass(), "date", term329782);
        setByteField(term329786, term329786.getClass(), "hour", (byte) 22);
        setByteField(term329786, term329786.getClass(), "minute", (byte) 27);
        setByteField(term329786, term329786.getClass(), "second", (byte) 40);
        setIntField(term329786, term329786.getClass(), "nano", 841047801);
        setField(term329781, term329781.getClass(), "time", term329786);
        setField(term329765, term329765.getClass(), "registerTime", term329781);
        setIntField(term329792, term329792.getClass(), "year", 2022);
        setShortField(term329792, term329792.getClass(), "month", (short) 2);
        setShortField(term329792, term329792.getClass(), "day", (short) 18);
        setField(term329791, term329791.getClass(), "date", term329792);
        setByteField(term329796, term329796.getClass(), "hour", (byte) 0);
        setByteField(term329796, term329796.getClass(), "minute", (byte) 5);
        setByteField(term329796, term329796.getClass(), "second", (byte) 2);
        setIntField(term329796, term329796.getClass(), "nano", 382588031);
        setField(term329791, term329791.getClass(), "time", term329796);
        setField(term329765, term329765.getClass(), "accessTime", term329791);
        setField(term329763, term329763.getClass(), "card", term329765);
        setField(term329763, term329763.getClass(), "userName", "budoEMvbXU");
        setIntField(term329814, term329814.getClass(), "year", 2028);
        setShortField(term329814, term329814.getClass(), "month", (short) 6);
        setShortField(term329814, term329814.getClass(), "day", (short) 22);
        setField(term329813, term329813.getClass(), "date", term329814);
        setByteField(term329818, term329818.getClass(), "hour", (byte) 0);
        setByteField(term329818, term329818.getClass(), "minute", (byte) 44);
        setByteField(term329818, term329818.getClass(), "second", (byte) 55);
        setIntField(term329818, term329818.getClass(), "nano", 696551955);
        setField(term329813, term329813.getClass(), "time", term329818);
        setField(term329763, term329763.getClass(), "lastLoginDate", term329813);
        setBooleanField(term329763, term329763.getClass(), "isWebJoin", false);
        setField(term329763, term329763.getClass(), "webLimitDate", "RrHQiUwApR");
        setIntField(term329763, term329763.getClass(), "level", -1941072303);
        setIntField(term329763, term329763.getClass(), "reincarnationNum", 405501485);
        setField(term329763, term329763.getClass(), "exp", "hoYSPkUlUz");
        setLongField(term329763, term329763.getClass(), "point", -2032737721665991212L);
        setLongField(term329763, term329763.getClass(), "totalPoint", 6861285564186139862L);
        setIntField(term329763, term329763.getClass(), "playCount", 1227837601);
        setIntField(term329763, term329763.getClass(), "multiPlayCount", -1995728635);
        setIntField(term329763, term329763.getClass(), "multiWinCount", -912416483);
        setIntField(term329763, term329763.getClass(), "requestResCount", -1119538480);
        setIntField(term329763, term329763.getClass(), "acceptResCount", 1097877685);
        setIntField(term329763, term329763.getClass(), "successResCount", -44723620);
        setIntField(term329763, term329763.getClass(), "playerRating", 1035284902);
        setIntField(term329763, term329763.getClass(), "highestRating", -1592531065);
        setIntField(term329763, term329763.getClass(), "nameplateId", -1555312883);
        setIntField(term329763, term329763.getClass(), "frameId", -168913232);
        setIntField(term329763, term329763.getClass(), "characterId", 1280762019);
        setIntField(term329763, term329763.getClass(), "trophyId", 1067531027);
        setIntField(term329763, term329763.getClass(), "playedTutorialBit", 837236889);
        setIntField(term329763, term329763.getClass(), "firstTutorialCancelNum", 1109328835);
        setIntField(term329763, term329763.getClass(), "masterTutorialCancelNum", -1333962836);
        setIntField(term329763, term329763.getClass(), "totalRepertoireCount", 526430292);
        setIntField(term329763, term329763.getClass(), "totalMapNum", 1063744494);
        setLongField(term329763, term329763.getClass(), "totalHiScore", -3094749699593978168L);
        setLongField(term329763, term329763.getClass(), "totalBasicHighScore", 4911838016842299479L);
        setLongField(term329763, term329763.getClass(), "totalAdvancedHighScore", 2600758108305337038L);
        setLongField(term329763, term329763.getClass(), "totalExpertHighScore", -5607146584686916044L);
        setLongField(term329763, term329763.getClass(), "totalMasterHighScore", -8618661675368845775L);
        setIntField(term329875, term329875.getClass(), "year", 2026);
        setShortField(term329875, term329875.getClass(), "month", (short) 4);
        setShortField(term329875, term329875.getClass(), "day", (short) 21);
        setField(term329874, term329874.getClass(), "date", term329875);
        setByteField(term329879, term329879.getClass(), "hour", (byte) 1);
        setByteField(term329879, term329879.getClass(), "minute", (byte) 37);
        setByteField(term329879, term329879.getClass(), "second", (byte) 57);
        setIntField(term329879, term329879.getClass(), "nano", 123653588);
        setField(term329874, term329874.getClass(), "time", term329879);
        setField(term329763, term329763.getClass(), "eventWatchedDate", term329874);
        setIntField(term329763, term329763.getClass(), "friendCount", 111922554);
        setBooleanField(term329763, term329763.getClass(), "isMaimai", true);
        setField(term329763, term329763.getClass(), "firstGameId", "IcvbaPtHCI");
        setField(term329763, term329763.getClass(), "firstRomVersion", "TpLdjLzfnM");
        setField(term329763, term329763.getClass(), "firstDataVersion", "bhoYUUtgsQ");
        setIntField(term329923, term329923.getClass(), "year", 2018);
        setShortField(term329923, term329923.getClass(), "month", (short) 8);
        setShortField(term329923, term329923.getClass(), "day", (short) 9);
        setField(term329922, term329922.getClass(), "date", term329923);
        setByteField(term329927, term329927.getClass(), "hour", (byte) 20);
        setByteField(term329927, term329927.getClass(), "minute", (byte) 13);
        setByteField(term329927, term329927.getClass(), "second", (byte) 10);
        setIntField(term329927, term329927.getClass(), "nano", 725487300);
        setField(term329922, term329922.getClass(), "time", term329927);
        setField(term329763, term329763.getClass(), "firstPlayDate", term329922);
        setField(term329763, term329763.getClass(), "lastGameId", "XcBhxrFdvV");
        setField(term329763, term329763.getClass(), "lastRomVersion", "wtDJOIcmRf");
        setField(term329763, term329763.getClass(), "lastDataVersion", "BMrbKMgdYV");
        setIntField(term329969, term329969.getClass(), "year", 2014);
        setShortField(term329969, term329969.getClass(), "month", (short) 10);
        setShortField(term329969, term329969.getClass(), "day", (short) 1);
        setField(term329968, term329968.getClass(), "date", term329969);
        setByteField(term329973, term329973.getClass(), "hour", (byte) 2);
        setByteField(term329973, term329973.getClass(), "minute", (byte) 34);
        setByteField(term329973, term329973.getClass(), "second", (byte) 6);
        setIntField(term329973, term329973.getClass(), "nano", 807208175);
        setField(term329968, term329968.getClass(), "time", term329973);
        setField(term329763, term329763.getClass(), "lastPlayDate", term329968);
        setIntField(term329763, term329763.getClass(), "lastPlaceId", -1273898792);
        setField(term329763, term329763.getClass(), "lastPlaceName", "kXDyYBqBoz");
        setField(term329763, term329763.getClass(), "lastRegionId", "JhMXaownHd");
        setField(term329763, term329763.getClass(), "lastRegionName", "iExZeOzVen");
        setField(term329763, term329763.getClass(), "lastAllNetId", "BTUQGyWEFZ");
        setField(term329763, term329763.getClass(), "lastClientId", "QAdZYMdOjK");
        setField(term329761, term329761.getClass(), "user", term329763);
        setIntField(term329761, term329761.getClass(), "ext1", -889929952);
        setIntField(term329761, term329761.getClass(), "ext2", -711257198);
        setIntField(term329761, term329761.getClass(), "ext3", 1109783759);
        setIntField(term329761, term329761.getClass(), "ext4", 730930342);
        setIntField(term329761, term329761.getClass(), "ext5", 1542202966);
        setIntField(term329761, term329761.getClass(), "ext6", -490456970);
        setIntField(term329761, term329761.getClass(), "ext7", -247072244);
        setIntField(term329761, term329761.getClass(), "ext8", 2038802976);
        setIntField(term329761, term329761.getClass(), "ext9", 1513737010);
        setIntField(term329761, term329761.getClass(), "ext10", -877125437);
        setIntField(term329761, term329761.getClass(), "ext11", 894418485);
        setIntField(term329761, term329761.getClass(), "ext12", 311233853);
        setIntField(term329761, term329761.getClass(), "ext13", 2105194977);
        setIntField(term329761, term329761.getClass(), "ext14", 2074238681);
        setIntField(term329761, term329761.getClass(), "ext15", -1655797819);
        setIntField(term329761, term329761.getClass(), "ext16", 101683079);
        setIntField(term329761, term329761.getClass(), "ext17", 1648565080);
        setIntField(term329761, term329761.getClass(), "ext18", 840301715);
        setIntField(term329761, term329761.getClass(), "ext19", -1010819427);
        setIntField(term329761, term329761.getClass(), "ext20", 942167805);
        term330059 = new Integer(-270257056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term330059;
        callMethod(klass, "setExt20", argTypes, term329761, args);
    }

};


