package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getLastPlayDate_26089434127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210873;

    public UserDetail_getLastPlayDate_26089434127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210877 = new Long(1353683663053784647L);
        Integer term210940 = new Integer(1496385296);
        Integer term210942 = new Integer(-1339659575);
        Integer term210944 = new Integer(2123597267);
        Integer term210946 = new Integer(-147077267);
        Integer term210948 = new Integer(-550222549);
        ArrayList term210938 = new ArrayList();
        ((ArrayList) term210938).add(term210940);
        ((ArrayList) term210938).add(term210942);
        ((ArrayList) term210938).add(term210944);
        ((ArrayList) term210938).add(term210946);
        ((ArrayList) term210938).add(term210948);
        Integer term210954 = new Integer(-499576898);
        Integer term210956 = new Integer(-686129078);
        ArrayList term210952 = new ArrayList();
        ((ArrayList) term210952).add(term210954);
        ((ArrayList) term210952).add(term210956);
        term210873 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term210875 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term210891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210896 = newInstance(Class.forName("java.time.LocalTime"));
        Object term210901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210906 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term210873, term210873.getClass(), "id", -8676124637070711103L);
        setLongField(term210875, term210875.getClass(), "id", 7783879338190250500L);
        setField(term210875, term210875.getClass(), "extId", term210877);
        setField(term210875, term210875.getClass(), "luid", "sVnZpKEBvK");
        setIntField(term210892, term210892.getClass(), "year", 2029);
        setShortField(term210892, term210892.getClass(), "month", (short) 6);
        setShortField(term210892, term210892.getClass(), "day", (short) 2);
        setField(term210891, term210891.getClass(), "date", term210892);
        setByteField(term210896, term210896.getClass(), "hour", (byte) 7);
        setByteField(term210896, term210896.getClass(), "minute", (byte) 13);
        setByteField(term210896, term210896.getClass(), "second", (byte) 48);
        setIntField(term210896, term210896.getClass(), "nano", 642728132);
        setField(term210891, term210891.getClass(), "time", term210896);
        setField(term210875, term210875.getClass(), "registerTime", term210891);
        setIntField(term210902, term210902.getClass(), "year", 2010);
        setShortField(term210902, term210902.getClass(), "month", (short) 10);
        setShortField(term210902, term210902.getClass(), "day", (short) 8);
        setField(term210901, term210901.getClass(), "date", term210902);
        setByteField(term210906, term210906.getClass(), "hour", (byte) 6);
        setByteField(term210906, term210906.getClass(), "minute", (byte) 12);
        setByteField(term210906, term210906.getClass(), "second", (byte) 51);
        setIntField(term210906, term210906.getClass(), "nano", 851312829);
        setField(term210901, term210901.getClass(), "time", term210906);
        setField(term210875, term210875.getClass(), "accessTime", term210901);
        setField(term210873, term210873.getClass(), "card", term210875);
        setField(term210873, term210873.getClass(), "userName", "gsSWxRyznB");
        setIntField(term210873, term210873.getClass(), "isNetMember", 471804975);
        setIntField(term210873, term210873.getClass(), "iconId", 1899331160);
        setIntField(term210873, term210873.getClass(), "plateId", 370966868);
        setIntField(term210873, term210873.getClass(), "titleId", 1534519464);
        setIntField(term210873, term210873.getClass(), "partnerId", 1522021119);
        setIntField(term210873, term210873.getClass(), "frameId", 1922776430);
        setIntField(term210873, term210873.getClass(), "selectMapId", 207030742);
        setIntField(term210873, term210873.getClass(), "totalAwake", -1102011869);
        setIntField(term210873, term210873.getClass(), "gradeRating", -407213500);
        setIntField(term210873, term210873.getClass(), "musicRating", -1528154718);
        setIntField(term210873, term210873.getClass(), "playerRating", -1963134013);
        setIntField(term210873, term210873.getClass(), "highestRating", -1567320858);
        setIntField(term210873, term210873.getClass(), "gradeRank", 292846859);
        setIntField(term210873, term210873.getClass(), "classRank", 1747705525);
        setIntField(term210873, term210873.getClass(), "courseRank", -198676619);
        setField(term210873, term210873.getClass(), "charaSlot", term210938);
        setField(term210873, term210873.getClass(), "charaLockSlot", term210952);
        setLongField(term210873, term210873.getClass(), "contentBit", 4316743640644410772L);
        setIntField(term210873, term210873.getClass(), "playCount", 899931868);
        setField(term210873, term210873.getClass(), "eventWatchedDate", "QtcSVmNNPc");
        setField(term210873, term210873.getClass(), "lastGameId", "ZWrQCNaFQY");
        setField(term210873, term210873.getClass(), "lastRomVersion", "vaFDDTDudR");
        setField(term210873, term210873.getClass(), "lastDataVersion", "PBRoPqwJHd");
        setField(term210873, term210873.getClass(), "lastLoginDate", "BJLEkBhnQC");
        setField(term210873, term210873.getClass(), "lastPlayDate", "yKmAEOsHku");
        setIntField(term210873, term210873.getClass(), "lastPlayCredit", -826588890);
        setIntField(term210873, term210873.getClass(), "lastPlayMode", 592322019);
        setIntField(term210873, term210873.getClass(), "lastPlaceId", -1046549331);
        setField(term210873, term210873.getClass(), "lastPlaceName", "omxqgDuzgA");
        setIntField(term210873, term210873.getClass(), "lastAllNetId", -798007195);
        setIntField(term210873, term210873.getClass(), "lastRegionId", -606955967);
        setField(term210873, term210873.getClass(), "lastRegionName", "XPPobohnTM");
        setField(term210873, term210873.getClass(), "lastClientId", "BcnTjlnsHF");
        setField(term210873, term210873.getClass(), "lastCountryCode", "oPKelMVmkR");
        setIntField(term210873, term210873.getClass(), "lastSelectEMoney", -903464599);
        setIntField(term210873, term210873.getClass(), "lastSelectTicket", 814440903);
        setIntField(term210873, term210873.getClass(), "lastSelectCourse", 766559610);
        setIntField(term210873, term210873.getClass(), "lastCountCourse", -1273191881);
        setField(term210873, term210873.getClass(), "firstGameId", "ggOWfjQawG");
        setField(term210873, term210873.getClass(), "firstRomVersion", "JPiMdDjAbG");
        setField(term210873, term210873.getClass(), "firstDataVersion", "qWPrDlGKMs");
        setField(term210873, term210873.getClass(), "firstPlayDate", "vpkcMTCXSW");
        setField(term210873, term210873.getClass(), "compatibleCmVersion", "dbONPOeClS");
        setField(term210873, term210873.getClass(), "dailyBonusDate", "kXemxowAVt");
        setField(term210873, term210873.getClass(), "dailyCourseBonusDate", "MTvBNcIZFw");
        setField(term210873, term210873.getClass(), "lastPairLoginDate", "yhXkQBxuxx");
        setField(term210873, term210873.getClass(), "lastTrialPlayDate", "ZOlvUJfNgF");
        setIntField(term210873, term210873.getClass(), "playVsCount", 313589831);
        setIntField(term210873, term210873.getClass(), "playSyncCount", 842617390);
        setIntField(term210873, term210873.getClass(), "winCount", 2085125396);
        setIntField(term210873, term210873.getClass(), "helpCount", -1735393631);
        setIntField(term210873, term210873.getClass(), "comboCount", -1094243769);
        setLongField(term210873, term210873.getClass(), "totalDeluxscore", -4183478737341281242L);
        setLongField(term210873, term210873.getClass(), "totalBasicDeluxscore", -960127958410557996L);
        setLongField(term210873, term210873.getClass(), "totalAdvancedDeluxscore", -9109033671281845327L);
        setLongField(term210873, term210873.getClass(), "totalExpertDeluxscore", -9020562412772214681L);
        setLongField(term210873, term210873.getClass(), "totalMasterDeluxscore", -9076799915988307065L);
        setLongField(term210873, term210873.getClass(), "totalReMasterDeluxscore", -4421656534116492940L);
        setIntField(term210873, term210873.getClass(), "totalSync", -673888239);
        setIntField(term210873, term210873.getClass(), "totalBasicSync", 2004435662);
        setIntField(term210873, term210873.getClass(), "totalAdvancedSync", 2045422512);
        setIntField(term210873, term210873.getClass(), "totalExpertSync", -848743363);
        setIntField(term210873, term210873.getClass(), "totalMasterSync", 2119087446);
        setIntField(term210873, term210873.getClass(), "totalReMasterSync", -14672184);
        setLongField(term210873, term210873.getClass(), "totalAchievement", 4314746393079054345L);
        setLongField(term210873, term210873.getClass(), "totalBasicAchievement", 3424047645128515693L);
        setLongField(term210873, term210873.getClass(), "totalAdvancedAchievement", 4599450768183486649L);
        setLongField(term210873, term210873.getClass(), "totalExpertAchievement", -849061143557743537L);
        setLongField(term210873, term210873.getClass(), "totalMasterAchievement", 3274260817753159712L);
        setLongField(term210873, term210873.getClass(), "totalReMasterAchievement", -5754577192356906968L);
        setLongField(term210873, term210873.getClass(), "playerOldRating", -6636501985091625487L);
        setLongField(term210873, term210873.getClass(), "playerNewRating", 6245978369677657049L);
        setIntField(term210873, term210873.getClass(), "banState", -1230971844);
        setLongField(term210873, term210873.getClass(), "dateTime", -2731641472967348371L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term210873, args);
    }

};


