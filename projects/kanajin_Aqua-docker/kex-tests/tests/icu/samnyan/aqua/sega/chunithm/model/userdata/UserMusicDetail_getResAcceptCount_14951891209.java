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

public class UserMusicDetail_getResAcceptCount_14951891209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91651;

    public UserMusicDetail_getResAcceptCount_14951891209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91657 = new Long(4502292577098212311L);
        term91651 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term91653 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term91655 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91676 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91708 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91769 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91863 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91651, term91651.getClass(), "id", -6951863671075383168L);
        setLongField(term91653, term91653.getClass(), "id", 444711052508404757L);
        setLongField(term91655, term91655.getClass(), "id", -4433754356855281318L);
        setField(term91655, term91655.getClass(), "extId", term91657);
        setField(term91655, term91655.getClass(), "luid", "vuGxdvURpp");
        setIntField(term91672, term91672.getClass(), "year", 2012);
        setShortField(term91672, term91672.getClass(), "month", (short) 11);
        setShortField(term91672, term91672.getClass(), "day", (short) 7);
        setField(term91671, term91671.getClass(), "date", term91672);
        setByteField(term91676, term91676.getClass(), "hour", (byte) 10);
        setByteField(term91676, term91676.getClass(), "minute", (byte) 35);
        setByteField(term91676, term91676.getClass(), "second", (byte) 16);
        setIntField(term91676, term91676.getClass(), "nano", 565845331);
        setField(term91671, term91671.getClass(), "time", term91676);
        setField(term91655, term91655.getClass(), "registerTime", term91671);
        setIntField(term91682, term91682.getClass(), "year", 2022);
        setShortField(term91682, term91682.getClass(), "month", (short) 2);
        setShortField(term91682, term91682.getClass(), "day", (short) 16);
        setField(term91681, term91681.getClass(), "date", term91682);
        setByteField(term91686, term91686.getClass(), "hour", (byte) 19);
        setByteField(term91686, term91686.getClass(), "minute", (byte) 33);
        setByteField(term91686, term91686.getClass(), "second", (byte) 28);
        setIntField(term91686, term91686.getClass(), "nano", 581349752);
        setField(term91681, term91681.getClass(), "time", term91686);
        setField(term91655, term91655.getClass(), "accessTime", term91681);
        setField(term91653, term91653.getClass(), "card", term91655);
        setField(term91653, term91653.getClass(), "userName", "zUgAERZZFZ");
        setIntField(term91704, term91704.getClass(), "year", 2029);
        setShortField(term91704, term91704.getClass(), "month", (short) 4);
        setShortField(term91704, term91704.getClass(), "day", (short) 21);
        setField(term91703, term91703.getClass(), "date", term91704);
        setByteField(term91708, term91708.getClass(), "hour", (byte) 17);
        setByteField(term91708, term91708.getClass(), "minute", (byte) 18);
        setByteField(term91708, term91708.getClass(), "second", (byte) 42);
        setIntField(term91708, term91708.getClass(), "nano", 150231223);
        setField(term91703, term91703.getClass(), "time", term91708);
        setField(term91653, term91653.getClass(), "lastLoginDate", term91703);
        setBooleanField(term91653, term91653.getClass(), "isWebJoin", true);
        setField(term91653, term91653.getClass(), "webLimitDate", "QhkdVFKaoy");
        setIntField(term91653, term91653.getClass(), "level", -1221698112);
        setIntField(term91653, term91653.getClass(), "reincarnationNum", 1551007948);
        setField(term91653, term91653.getClass(), "exp", "WCQDPwVjsS");
        setLongField(term91653, term91653.getClass(), "point", -8219871028565555567L);
        setLongField(term91653, term91653.getClass(), "totalPoint", -4664784590063321060L);
        setIntField(term91653, term91653.getClass(), "playCount", -823083171);
        setIntField(term91653, term91653.getClass(), "multiPlayCount", 267756518);
        setIntField(term91653, term91653.getClass(), "multiWinCount", -2130068890);
        setIntField(term91653, term91653.getClass(), "requestResCount", -111157494);
        setIntField(term91653, term91653.getClass(), "acceptResCount", 1356632069);
        setIntField(term91653, term91653.getClass(), "successResCount", -497887292);
        setIntField(term91653, term91653.getClass(), "playerRating", 738235414);
        setIntField(term91653, term91653.getClass(), "highestRating", -573957070);
        setIntField(term91653, term91653.getClass(), "nameplateId", -1100140077);
        setIntField(term91653, term91653.getClass(), "frameId", -301805097);
        setIntField(term91653, term91653.getClass(), "characterId", 496142964);
        setIntField(term91653, term91653.getClass(), "trophyId", 520268147);
        setIntField(term91653, term91653.getClass(), "playedTutorialBit", 702608636);
        setIntField(term91653, term91653.getClass(), "firstTutorialCancelNum", 352605161);
        setIntField(term91653, term91653.getClass(), "masterTutorialCancelNum", -1191829886);
        setIntField(term91653, term91653.getClass(), "totalRepertoireCount", -1544525961);
        setIntField(term91653, term91653.getClass(), "totalMapNum", 190733490);
        setLongField(term91653, term91653.getClass(), "totalHiScore", -8176783923061900011L);
        setLongField(term91653, term91653.getClass(), "totalBasicHighScore", -9018044396967594984L);
        setLongField(term91653, term91653.getClass(), "totalAdvancedHighScore", -545192431010524816L);
        setLongField(term91653, term91653.getClass(), "totalExpertHighScore", 6466572752098109458L);
        setLongField(term91653, term91653.getClass(), "totalMasterHighScore", 2539855115472922877L);
        setIntField(term91765, term91765.getClass(), "year", 2019);
        setShortField(term91765, term91765.getClass(), "month", (short) 12);
        setShortField(term91765, term91765.getClass(), "day", (short) 7);
        setField(term91764, term91764.getClass(), "date", term91765);
        setByteField(term91769, term91769.getClass(), "hour", (byte) 15);
        setByteField(term91769, term91769.getClass(), "minute", (byte) 45);
        setByteField(term91769, term91769.getClass(), "second", (byte) 15);
        setIntField(term91769, term91769.getClass(), "nano", 16713462);
        setField(term91764, term91764.getClass(), "time", term91769);
        setField(term91653, term91653.getClass(), "eventWatchedDate", term91764);
        setIntField(term91653, term91653.getClass(), "friendCount", 2100537808);
        setBooleanField(term91653, term91653.getClass(), "isMaimai", true);
        setField(term91653, term91653.getClass(), "firstGameId", "XkZOYFvTGI");
        setField(term91653, term91653.getClass(), "firstRomVersion", "NifhlBZIDF");
        setField(term91653, term91653.getClass(), "firstDataVersion", "vKEgtSbaYp");
        setIntField(term91813, term91813.getClass(), "year", 2013);
        setShortField(term91813, term91813.getClass(), "month", (short) 1);
        setShortField(term91813, term91813.getClass(), "day", (short) 1);
        setField(term91812, term91812.getClass(), "date", term91813);
        setByteField(term91817, term91817.getClass(), "hour", (byte) 23);
        setByteField(term91817, term91817.getClass(), "minute", (byte) 48);
        setByteField(term91817, term91817.getClass(), "second", (byte) 59);
        setIntField(term91817, term91817.getClass(), "nano", 211446868);
        setField(term91812, term91812.getClass(), "time", term91817);
        setField(term91653, term91653.getClass(), "firstPlayDate", term91812);
        setField(term91653, term91653.getClass(), "lastGameId", "FnjEwOlAkC");
        setField(term91653, term91653.getClass(), "lastRomVersion", "ZsGqLnRMml");
        setField(term91653, term91653.getClass(), "lastDataVersion", "BTXsqJgjjs");
        setIntField(term91859, term91859.getClass(), "year", 2012);
        setShortField(term91859, term91859.getClass(), "month", (short) 12);
        setShortField(term91859, term91859.getClass(), "day", (short) 21);
        setField(term91858, term91858.getClass(), "date", term91859);
        setByteField(term91863, term91863.getClass(), "hour", (byte) 0);
        setByteField(term91863, term91863.getClass(), "minute", (byte) 9);
        setByteField(term91863, term91863.getClass(), "second", (byte) 16);
        setIntField(term91863, term91863.getClass(), "nano", 344150131);
        setField(term91858, term91858.getClass(), "time", term91863);
        setField(term91653, term91653.getClass(), "lastPlayDate", term91858);
        setIntField(term91653, term91653.getClass(), "lastPlaceId", 1383366759);
        setField(term91653, term91653.getClass(), "lastPlaceName", "OjFRpvsLzi");
        setField(term91653, term91653.getClass(), "lastRegionId", "kugZgYRWcG");
        setField(term91653, term91653.getClass(), "lastRegionName", "OzucqAMebQ");
        setField(term91653, term91653.getClass(), "lastAllNetId", "VecourIOHN");
        setField(term91653, term91653.getClass(), "lastClientId", "tZiwBSETUL");
        setField(term91651, term91651.getClass(), "user", term91653);
        setIntField(term91651, term91651.getClass(), "musicId", -424387882);
        setIntField(term91651, term91651.getClass(), "level", -1591399293);
        setIntField(term91651, term91651.getClass(), "playCount", -1486539515);
        setIntField(term91651, term91651.getClass(), "scoreMax", -477235854);
        setIntField(term91651, term91651.getClass(), "resRequestCount", -545213489);
        setIntField(term91651, term91651.getClass(), "resAcceptCount", 1341679614);
        setIntField(term91651, term91651.getClass(), "resSuccessCount", -1687904905);
        setIntField(term91651, term91651.getClass(), "missCount", -403695011);
        setIntField(term91651, term91651.getClass(), "maxComboCount", 1739332917);
        setBooleanField(term91651, term91651.getClass(), "isFullCombo", false);
        setBooleanField(term91651, term91651.getClass(), "isAllJustice", false);
        setBooleanField(term91651, term91651.getClass(), "isSuccess", false);
        setIntField(term91651, term91651.getClass(), "fullChain", -1942607717);
        setIntField(term91651, term91651.getClass(), "maxChain", 2004204445);
        setIntField(term91651, term91651.getClass(), "scoreRank", 1813480917);
        setBooleanField(term91651, term91651.getClass(), "isLock", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResAcceptCount", argTypes, term91651, args);
    }

};


