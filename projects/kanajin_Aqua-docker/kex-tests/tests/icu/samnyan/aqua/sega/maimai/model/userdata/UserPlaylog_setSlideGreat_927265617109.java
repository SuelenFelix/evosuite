package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserPlaylog_setSlideGreat_927265617109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3990703;
     Object term3991015;

    public UserPlaylog_setSlideGreat_927265617109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3990709 = new Long(-3729917382497386096L);
        term3990703 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3990705 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3990707 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3990723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3990724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3990728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3990733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3990734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3990738 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3990703, term3990703.getClass(), "id", -2539790952998150394L);
        setLongField(term3990705, term3990705.getClass(), "id", 636720252891634602L);
        setLongField(term3990707, term3990707.getClass(), "id", 3239001090556022326L);
        setField(term3990707, term3990707.getClass(), "extId", term3990709);
        setField(term3990707, term3990707.getClass(), "luid", "suOnDkVqIt");
        setIntField(term3990724, term3990724.getClass(), "year", 2013);
        setShortField(term3990724, term3990724.getClass(), "month", (short) 6);
        setShortField(term3990724, term3990724.getClass(), "day", (short) 22);
        setField(term3990723, term3990723.getClass(), "date", term3990724);
        setByteField(term3990728, term3990728.getClass(), "hour", (byte) 18);
        setByteField(term3990728, term3990728.getClass(), "minute", (byte) 25);
        setByteField(term3990728, term3990728.getClass(), "second", (byte) 35);
        setIntField(term3990728, term3990728.getClass(), "nano", 61853076);
        setField(term3990723, term3990723.getClass(), "time", term3990728);
        setField(term3990707, term3990707.getClass(), "registerTime", term3990723);
        setIntField(term3990734, term3990734.getClass(), "year", 2020);
        setShortField(term3990734, term3990734.getClass(), "month", (short) 3);
        setShortField(term3990734, term3990734.getClass(), "day", (short) 23);
        setField(term3990733, term3990733.getClass(), "date", term3990734);
        setByteField(term3990738, term3990738.getClass(), "hour", (byte) 21);
        setByteField(term3990738, term3990738.getClass(), "minute", (byte) 7);
        setByteField(term3990738, term3990738.getClass(), "second", (byte) 50);
        setIntField(term3990738, term3990738.getClass(), "nano", 461090450);
        setField(term3990733, term3990733.getClass(), "time", term3990738);
        setField(term3990707, term3990707.getClass(), "accessTime", term3990733);
        setField(term3990705, term3990705.getClass(), "card", term3990707);
        setIntField(term3990705, term3990705.getClass(), "lastDataVersion", 946567689);
        setField(term3990705, term3990705.getClass(), "userName", "dZPUTTlLTq");
        setIntField(term3990705, term3990705.getClass(), "point", 171157463);
        setIntField(term3990705, term3990705.getClass(), "totalPoint", 1345039759);
        setIntField(term3990705, term3990705.getClass(), "iconId", -1213930646);
        setIntField(term3990705, term3990705.getClass(), "nameplateId", -1330726644);
        setIntField(term3990705, term3990705.getClass(), "frameId", -68956712);
        setIntField(term3990705, term3990705.getClass(), "trophyId", -1110748964);
        setIntField(term3990705, term3990705.getClass(), "playCount", -564380169);
        setIntField(term3990705, term3990705.getClass(), "playVsCount", 1616951686);
        setIntField(term3990705, term3990705.getClass(), "playSyncCount", 773818996);
        setIntField(term3990705, term3990705.getClass(), "winCount", -1412271980);
        setIntField(term3990705, term3990705.getClass(), "helpCount", -37191380);
        setIntField(term3990705, term3990705.getClass(), "comboCount", 337976565);
        setIntField(term3990705, term3990705.getClass(), "feverCount", -410968906);
        setIntField(term3990705, term3990705.getClass(), "totalHiScore", -169036902);
        setIntField(term3990705, term3990705.getClass(), "totalEasyHighScore", 565016912);
        setIntField(term3990705, term3990705.getClass(), "totalBasicHighScore", -151798175);
        setIntField(term3990705, term3990705.getClass(), "totalAdvancedHighScore", -1808297319);
        setIntField(term3990705, term3990705.getClass(), "totalExpertHighScore", -2029472099);
        setIntField(term3990705, term3990705.getClass(), "totalMasterHighScore", 386217397);
        setIntField(term3990705, term3990705.getClass(), "totalReMasterHighScore", 688732590);
        setIntField(term3990705, term3990705.getClass(), "totalHighSync", 1462362062);
        setIntField(term3990705, term3990705.getClass(), "totalEasySync", -1603480181);
        setIntField(term3990705, term3990705.getClass(), "totalBasicSync", -1412954344);
        setIntField(term3990705, term3990705.getClass(), "totalAdvancedSync", -757066704);
        setIntField(term3990705, term3990705.getClass(), "totalExpertSync", -1200743236);
        setIntField(term3990705, term3990705.getClass(), "totalMasterSync", -724920250);
        setIntField(term3990705, term3990705.getClass(), "totalReMasterSync", 1472954445);
        setIntField(term3990705, term3990705.getClass(), "playerRating", 901732996);
        setIntField(term3990705, term3990705.getClass(), "highestRating", 742863303);
        setIntField(term3990705, term3990705.getClass(), "rankAuthTailId", 1154463384);
        setField(term3990705, term3990705.getClass(), "eventWatchedDate", "jlwYxrsHID");
        setField(term3990705, term3990705.getClass(), "webLimitDate", "VNyJEGfJQs");
        setIntField(term3990705, term3990705.getClass(), "challengeTrackPhase", -1929487077);
        setIntField(term3990705, term3990705.getClass(), "firstPlayBits", 956614557);
        setField(term3990705, term3990705.getClass(), "lastPlayDate", "WVLVlGihyv");
        setIntField(term3990705, term3990705.getClass(), "lastPlaceId", 943420116);
        setField(term3990705, term3990705.getClass(), "lastPlaceName", "PTyhoVUKZh");
        setIntField(term3990705, term3990705.getClass(), "lastRegionId", -1892751516);
        setField(term3990705, term3990705.getClass(), "lastRegionName", "YWLPGJJpXI");
        setField(term3990705, term3990705.getClass(), "lastClientId", "hSOQwaIJCk");
        setField(term3990705, term3990705.getClass(), "lastCountryCode", "OXGRIbSJLM");
        setIntField(term3990705, term3990705.getClass(), "eventPoint", -247368860);
        setIntField(term3990705, term3990705.getClass(), "totalLv", 2034616605);
        setIntField(term3990705, term3990705.getClass(), "lastLoginBonusDay", 1677389581);
        setIntField(term3990705, term3990705.getClass(), "lastSurvivalBonusDay", -821432545);
        setIntField(term3990705, term3990705.getClass(), "loginBonusLv", -444853623);
        setField(term3990703, term3990703.getClass(), "user", term3990705);
        setIntField(term3990703, term3990703.getClass(), "orderId", -1042025243);
        setLongField(term3990703, term3990703.getClass(), "sortNumber", -1039049279349784448L);
        setIntField(term3990703, term3990703.getClass(), "placeId", -2114684703);
        setField(term3990703, term3990703.getClass(), "placeName", "fxnGvoYRrM");
        setField(term3990703, term3990703.getClass(), "country", "jgtIivUbAj");
        setIntField(term3990703, term3990703.getClass(), "regionId", 1145676157);
        setField(term3990703, term3990703.getClass(), "playDate", "IQmkoVzZyj");
        setField(term3990703, term3990703.getClass(), "userPlayDate", "cWOIdCrErJ");
        setIntField(term3990703, term3990703.getClass(), "musicId", -292784884);
        setIntField(term3990703, term3990703.getClass(), "level", -1128872977);
        setIntField(term3990703, term3990703.getClass(), "gameMode", 199535182);
        setIntField(term3990703, term3990703.getClass(), "rivalNum", 554158702);
        setIntField(term3990703, term3990703.getClass(), "track", -1415894922);
        setIntField(term3990703, term3990703.getClass(), "eventId", 1091937882);
        setBooleanField(term3990703, term3990703.getClass(), "isFreeToPlay", false);
        setIntField(term3990703, term3990703.getClass(), "playerRating", -1298503326);
        setLongField(term3990703, term3990703.getClass(), "playedUserId1", -4364207513265572351L);
        setField(term3990703, term3990703.getClass(), "playedUserName1", "gCXoynERDR");
        setIntField(term3990703, term3990703.getClass(), "playedMusicLevel1", -252038581);
        setLongField(term3990703, term3990703.getClass(), "playedUserId2", -1572280413122461718L);
        setField(term3990703, term3990703.getClass(), "playedUserName2", "RaHJuhjrVq");
        setIntField(term3990703, term3990703.getClass(), "playedMusicLevel2", -60649606);
        setLongField(term3990703, term3990703.getClass(), "playedUserId3", -9038009912829485901L);
        setField(term3990703, term3990703.getClass(), "playedUserName3", "BIMkqSLino");
        setIntField(term3990703, term3990703.getClass(), "playedMusicLevel3", 275170502);
        setIntField(term3990703, term3990703.getClass(), "achievement", -102715138);
        setIntField(term3990703, term3990703.getClass(), "score", 319631692);
        setIntField(term3990703, term3990703.getClass(), "tapScore", 795468378);
        setIntField(term3990703, term3990703.getClass(), "holdScore", -1681390878);
        setIntField(term3990703, term3990703.getClass(), "slideScore", -231366179);
        setIntField(term3990703, term3990703.getClass(), "breakScore", 1833928254);
        setIntField(term3990703, term3990703.getClass(), "syncRate", -2042277495);
        setIntField(term3990703, term3990703.getClass(), "vsWin", 430774082);
        setBooleanField(term3990703, term3990703.getClass(), "isAllPerfect", false);
        setIntField(term3990703, term3990703.getClass(), "fullCombo", 1173561300);
        setIntField(term3990703, term3990703.getClass(), "maxFever", 2000184433);
        setIntField(term3990703, term3990703.getClass(), "maxCombo", -85774703);
        setIntField(term3990703, term3990703.getClass(), "tapPerfect", 1151782005);
        setIntField(term3990703, term3990703.getClass(), "tapGreat", -821199013);
        setIntField(term3990703, term3990703.getClass(), "tapGood", -1184109322);
        setIntField(term3990703, term3990703.getClass(), "tapBad", -16236746);
        setIntField(term3990703, term3990703.getClass(), "holdPerfect", 1932836694);
        setIntField(term3990703, term3990703.getClass(), "holdGreat", 2043742027);
        setIntField(term3990703, term3990703.getClass(), "holdGood", 867272458);
        setIntField(term3990703, term3990703.getClass(), "holdBad", 1553702619);
        setIntField(term3990703, term3990703.getClass(), "slidePerfect", -993775966);
        setIntField(term3990703, term3990703.getClass(), "slideGreat", 273631976);
        setIntField(term3990703, term3990703.getClass(), "slideGood", -1391277108);
        setIntField(term3990703, term3990703.getClass(), "slideBad", 2089079333);
        setIntField(term3990703, term3990703.getClass(), "breakPerfect", 655601611);
        setIntField(term3990703, term3990703.getClass(), "breakGreat", -1514561502);
        setIntField(term3990703, term3990703.getClass(), "breakGood", -1370425034);
        setIntField(term3990703, term3990703.getClass(), "breakBad", 551874782);
        setBooleanField(term3990703, term3990703.getClass(), "isTrackSkip", false);
        setBooleanField(term3990703, term3990703.getClass(), "isHighScore", true);
        setBooleanField(term3990703, term3990703.getClass(), "isChallengeTrack", true);
        setIntField(term3990703, term3990703.getClass(), "challengeLife", 1381817611);
        setIntField(term3990703, term3990703.getClass(), "challengeRemain", 955659799);
        setIntField(term3990703, term3990703.getClass(), "isAllPerfectPlus", -414572470);
        term3991015 = new Integer(681445915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3991015;
        callMethod(klass, "setSlideGreat", argTypes, term3990703, args);
    }

};


