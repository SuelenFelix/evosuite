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

public class UserDetail_getLastPlayDate_26089434128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210928;

    public UserDetail_getLastPlayDate_26089434128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210932 = new Long(1353683663053784647L);
        Integer term210995 = new Integer(1496385296);
        Integer term210997 = new Integer(-1339659575);
        Integer term210999 = new Integer(2123597267);
        Integer term211001 = new Integer(-147077267);
        Integer term211003 = new Integer(-550222549);
        ArrayList term210993 = new ArrayList();
        ((ArrayList) term210993).add(term210995);
        ((ArrayList) term210993).add(term210997);
        ((ArrayList) term210993).add(term210999);
        ((ArrayList) term210993).add(term211001);
        ((ArrayList) term210993).add(term211003);
        Integer term211009 = new Integer(-499576898);
        Integer term211011 = new Integer(-686129078);
        ArrayList term211007 = new ArrayList();
        ((ArrayList) term211007).add(term211009);
        ((ArrayList) term211007).add(term211011);
        term210928 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term210930 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term210946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210951 = newInstance(Class.forName("java.time.LocalTime"));
        Object term210956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210961 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term210928, term210928.getClass(), "id", -8676124637070711103L);
        setLongField(term210930, term210930.getClass(), "id", 7783879338190250500L);
        setField(term210930, term210930.getClass(), "extId", term210932);
        setField(term210930, term210930.getClass(), "luid", "sVnZpKEBvK");
        setIntField(term210947, term210947.getClass(), "year", 2029);
        setShortField(term210947, term210947.getClass(), "month", (short) 6);
        setShortField(term210947, term210947.getClass(), "day", (short) 2);
        setField(term210946, term210946.getClass(), "date", term210947);
        setByteField(term210951, term210951.getClass(), "hour", (byte) 7);
        setByteField(term210951, term210951.getClass(), "minute", (byte) 13);
        setByteField(term210951, term210951.getClass(), "second", (byte) 48);
        setIntField(term210951, term210951.getClass(), "nano", 642728132);
        setField(term210946, term210946.getClass(), "time", term210951);
        setField(term210930, term210930.getClass(), "registerTime", term210946);
        setIntField(term210957, term210957.getClass(), "year", 2010);
        setShortField(term210957, term210957.getClass(), "month", (short) 10);
        setShortField(term210957, term210957.getClass(), "day", (short) 8);
        setField(term210956, term210956.getClass(), "date", term210957);
        setByteField(term210961, term210961.getClass(), "hour", (byte) 6);
        setByteField(term210961, term210961.getClass(), "minute", (byte) 12);
        setByteField(term210961, term210961.getClass(), "second", (byte) 51);
        setIntField(term210961, term210961.getClass(), "nano", 851312829);
        setField(term210956, term210956.getClass(), "time", term210961);
        setField(term210930, term210930.getClass(), "accessTime", term210956);
        setField(term210928, term210928.getClass(), "card", term210930);
        setField(term210928, term210928.getClass(), "userName", "gsSWxRyznB");
        setIntField(term210928, term210928.getClass(), "isNetMember", 471804975);
        setIntField(term210928, term210928.getClass(), "iconId", 1899331160);
        setIntField(term210928, term210928.getClass(), "plateId", 370966868);
        setIntField(term210928, term210928.getClass(), "titleId", 1534519464);
        setIntField(term210928, term210928.getClass(), "partnerId", 1522021119);
        setIntField(term210928, term210928.getClass(), "frameId", 1922776430);
        setIntField(term210928, term210928.getClass(), "selectMapId", 207030742);
        setIntField(term210928, term210928.getClass(), "totalAwake", -1102011869);
        setIntField(term210928, term210928.getClass(), "gradeRating", -407213500);
        setIntField(term210928, term210928.getClass(), "musicRating", -1528154718);
        setIntField(term210928, term210928.getClass(), "playerRating", -1963134013);
        setIntField(term210928, term210928.getClass(), "highestRating", -1567320858);
        setIntField(term210928, term210928.getClass(), "gradeRank", 292846859);
        setIntField(term210928, term210928.getClass(), "classRank", 1747705525);
        setIntField(term210928, term210928.getClass(), "courseRank", -198676619);
        setField(term210928, term210928.getClass(), "charaSlot", term210993);
        setField(term210928, term210928.getClass(), "charaLockSlot", term211007);
        setLongField(term210928, term210928.getClass(), "contentBit", 4316743640644410772L);
        setIntField(term210928, term210928.getClass(), "playCount", 899931868);
        setField(term210928, term210928.getClass(), "eventWatchedDate", "QtcSVmNNPc");
        setField(term210928, term210928.getClass(), "lastGameId", "ZWrQCNaFQY");
        setField(term210928, term210928.getClass(), "lastRomVersion", "vaFDDTDudR");
        setField(term210928, term210928.getClass(), "lastDataVersion", "PBRoPqwJHd");
        setField(term210928, term210928.getClass(), "lastLoginDate", "BJLEkBhnQC");
        setField(term210928, term210928.getClass(), "lastPlayDate", "yKmAEOsHku");
        setIntField(term210928, term210928.getClass(), "lastPlayCredit", -826588890);
        setIntField(term210928, term210928.getClass(), "lastPlayMode", 592322019);
        setIntField(term210928, term210928.getClass(), "lastPlaceId", -1046549331);
        setField(term210928, term210928.getClass(), "lastPlaceName", "omxqgDuzgA");
        setIntField(term210928, term210928.getClass(), "lastAllNetId", -798007195);
        setIntField(term210928, term210928.getClass(), "lastRegionId", -606955967);
        setField(term210928, term210928.getClass(), "lastRegionName", "XPPobohnTM");
        setField(term210928, term210928.getClass(), "lastClientId", "BcnTjlnsHF");
        setField(term210928, term210928.getClass(), "lastCountryCode", "oPKelMVmkR");
        setIntField(term210928, term210928.getClass(), "lastSelectEMoney", -903464599);
        setIntField(term210928, term210928.getClass(), "lastSelectTicket", 814440903);
        setIntField(term210928, term210928.getClass(), "lastSelectCourse", 766559610);
        setIntField(term210928, term210928.getClass(), "lastCountCourse", -1273191881);
        setField(term210928, term210928.getClass(), "firstGameId", "ggOWfjQawG");
        setField(term210928, term210928.getClass(), "firstRomVersion", "JPiMdDjAbG");
        setField(term210928, term210928.getClass(), "firstDataVersion", "qWPrDlGKMs");
        setField(term210928, term210928.getClass(), "firstPlayDate", "vpkcMTCXSW");
        setField(term210928, term210928.getClass(), "compatibleCmVersion", "dbONPOeClS");
        setField(term210928, term210928.getClass(), "dailyBonusDate", "kXemxowAVt");
        setField(term210928, term210928.getClass(), "dailyCourseBonusDate", "MTvBNcIZFw");
        setField(term210928, term210928.getClass(), "lastPairLoginDate", "yhXkQBxuxx");
        setField(term210928, term210928.getClass(), "lastTrialPlayDate", "ZOlvUJfNgF");
        setIntField(term210928, term210928.getClass(), "playVsCount", 313589831);
        setIntField(term210928, term210928.getClass(), "playSyncCount", 842617390);
        setIntField(term210928, term210928.getClass(), "winCount", 2085125396);
        setIntField(term210928, term210928.getClass(), "helpCount", -1735393631);
        setIntField(term210928, term210928.getClass(), "comboCount", -1094243769);
        setLongField(term210928, term210928.getClass(), "totalDeluxscore", -4183478737341281242L);
        setLongField(term210928, term210928.getClass(), "totalBasicDeluxscore", -960127958410557996L);
        setLongField(term210928, term210928.getClass(), "totalAdvancedDeluxscore", -9109033671281845327L);
        setLongField(term210928, term210928.getClass(), "totalExpertDeluxscore", -9020562412772214681L);
        setLongField(term210928, term210928.getClass(), "totalMasterDeluxscore", -9076799915988307065L);
        setLongField(term210928, term210928.getClass(), "totalReMasterDeluxscore", -4421656534116492940L);
        setIntField(term210928, term210928.getClass(), "totalSync", -673888239);
        setIntField(term210928, term210928.getClass(), "totalBasicSync", 2004435662);
        setIntField(term210928, term210928.getClass(), "totalAdvancedSync", 2045422512);
        setIntField(term210928, term210928.getClass(), "totalExpertSync", -848743363);
        setIntField(term210928, term210928.getClass(), "totalMasterSync", 2119087446);
        setIntField(term210928, term210928.getClass(), "totalReMasterSync", -14672184);
        setLongField(term210928, term210928.getClass(), "totalAchievement", 4314746393079054345L);
        setLongField(term210928, term210928.getClass(), "totalBasicAchievement", 3424047645128515693L);
        setLongField(term210928, term210928.getClass(), "totalAdvancedAchievement", 4599450768183486649L);
        setLongField(term210928, term210928.getClass(), "totalExpertAchievement", -849061143557743537L);
        setLongField(term210928, term210928.getClass(), "totalMasterAchievement", 3274260817753159712L);
        setLongField(term210928, term210928.getClass(), "totalReMasterAchievement", -5754577192356906968L);
        setLongField(term210928, term210928.getClass(), "playerOldRating", -6636501985091625487L);
        setLongField(term210928, term210928.getClass(), "playerNewRating", 6245978369677657049L);
        setIntField(term210928, term210928.getClass(), "banState", -1230971844);
        setLongField(term210928, term210928.getClass(), "dateTime", -2731641472967348371L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term210928, args);
    }

};


