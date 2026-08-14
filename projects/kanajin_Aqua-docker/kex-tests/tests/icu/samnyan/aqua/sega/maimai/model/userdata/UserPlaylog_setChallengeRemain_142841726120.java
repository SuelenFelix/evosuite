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

public class UserPlaylog_setChallengeRemain_142841726120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3995917;
     Object term3996229;

    public UserPlaylog_setChallengeRemain_142841726120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3995923 = new Long(7113434039163821271L);
        term3995917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3995919 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3995921 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3995937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3995938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3995942 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3995947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3995948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3995952 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3995917, term3995917.getClass(), "id", -1701965808167224049L);
        setLongField(term3995919, term3995919.getClass(), "id", -5092149357387920424L);
        setLongField(term3995921, term3995921.getClass(), "id", -5110120883716499638L);
        setField(term3995921, term3995921.getClass(), "extId", term3995923);
        setField(term3995921, term3995921.getClass(), "luid", "OJyZhUVKeV");
        setIntField(term3995938, term3995938.getClass(), "year", 2029);
        setShortField(term3995938, term3995938.getClass(), "month", (short) 9);
        setShortField(term3995938, term3995938.getClass(), "day", (short) 5);
        setField(term3995937, term3995937.getClass(), "date", term3995938);
        setByteField(term3995942, term3995942.getClass(), "hour", (byte) 7);
        setByteField(term3995942, term3995942.getClass(), "minute", (byte) 9);
        setByteField(term3995942, term3995942.getClass(), "second", (byte) 51);
        setIntField(term3995942, term3995942.getClass(), "nano", 460448107);
        setField(term3995937, term3995937.getClass(), "time", term3995942);
        setField(term3995921, term3995921.getClass(), "registerTime", term3995937);
        setIntField(term3995948, term3995948.getClass(), "year", 2023);
        setShortField(term3995948, term3995948.getClass(), "month", (short) 3);
        setShortField(term3995948, term3995948.getClass(), "day", (short) 4);
        setField(term3995947, term3995947.getClass(), "date", term3995948);
        setByteField(term3995952, term3995952.getClass(), "hour", (byte) 6);
        setByteField(term3995952, term3995952.getClass(), "minute", (byte) 41);
        setByteField(term3995952, term3995952.getClass(), "second", (byte) 28);
        setIntField(term3995952, term3995952.getClass(), "nano", 253941679);
        setField(term3995947, term3995947.getClass(), "time", term3995952);
        setField(term3995921, term3995921.getClass(), "accessTime", term3995947);
        setField(term3995919, term3995919.getClass(), "card", term3995921);
        setIntField(term3995919, term3995919.getClass(), "lastDataVersion", 1860346711);
        setField(term3995919, term3995919.getClass(), "userName", "NYFDhIWVvH");
        setIntField(term3995919, term3995919.getClass(), "point", -1564334327);
        setIntField(term3995919, term3995919.getClass(), "totalPoint", -87123696);
        setIntField(term3995919, term3995919.getClass(), "iconId", 811994899);
        setIntField(term3995919, term3995919.getClass(), "nameplateId", -42581909);
        setIntField(term3995919, term3995919.getClass(), "frameId", 575237318);
        setIntField(term3995919, term3995919.getClass(), "trophyId", 1734383111);
        setIntField(term3995919, term3995919.getClass(), "playCount", -1163864567);
        setIntField(term3995919, term3995919.getClass(), "playVsCount", -2121970032);
        setIntField(term3995919, term3995919.getClass(), "playSyncCount", 1467881878);
        setIntField(term3995919, term3995919.getClass(), "winCount", -570311979);
        setIntField(term3995919, term3995919.getClass(), "helpCount", 1608704859);
        setIntField(term3995919, term3995919.getClass(), "comboCount", -1517359512);
        setIntField(term3995919, term3995919.getClass(), "feverCount", 1677603335);
        setIntField(term3995919, term3995919.getClass(), "totalHiScore", 171323665);
        setIntField(term3995919, term3995919.getClass(), "totalEasyHighScore", 1476724419);
        setIntField(term3995919, term3995919.getClass(), "totalBasicHighScore", 735945563);
        setIntField(term3995919, term3995919.getClass(), "totalAdvancedHighScore", 1037808485);
        setIntField(term3995919, term3995919.getClass(), "totalExpertHighScore", 601979128);
        setIntField(term3995919, term3995919.getClass(), "totalMasterHighScore", 408991890);
        setIntField(term3995919, term3995919.getClass(), "totalReMasterHighScore", -1257189409);
        setIntField(term3995919, term3995919.getClass(), "totalHighSync", 1148949687);
        setIntField(term3995919, term3995919.getClass(), "totalEasySync", 637864265);
        setIntField(term3995919, term3995919.getClass(), "totalBasicSync", 80807361);
        setIntField(term3995919, term3995919.getClass(), "totalAdvancedSync", -334810631);
        setIntField(term3995919, term3995919.getClass(), "totalExpertSync", 2058314479);
        setIntField(term3995919, term3995919.getClass(), "totalMasterSync", -1511093904);
        setIntField(term3995919, term3995919.getClass(), "totalReMasterSync", 1741531461);
        setIntField(term3995919, term3995919.getClass(), "playerRating", -1280433150);
        setIntField(term3995919, term3995919.getClass(), "highestRating", -397415332);
        setIntField(term3995919, term3995919.getClass(), "rankAuthTailId", -15922714);
        setField(term3995919, term3995919.getClass(), "eventWatchedDate", "kvuznWUgCq");
        setField(term3995919, term3995919.getClass(), "webLimitDate", "TgcmepKbbr");
        setIntField(term3995919, term3995919.getClass(), "challengeTrackPhase", 1628300966);
        setIntField(term3995919, term3995919.getClass(), "firstPlayBits", -352213586);
        setField(term3995919, term3995919.getClass(), "lastPlayDate", "uKfDuseIoJ");
        setIntField(term3995919, term3995919.getClass(), "lastPlaceId", -552423581);
        setField(term3995919, term3995919.getClass(), "lastPlaceName", "ReeZOeaHva");
        setIntField(term3995919, term3995919.getClass(), "lastRegionId", -1992892713);
        setField(term3995919, term3995919.getClass(), "lastRegionName", "oLQOzSzPeG");
        setField(term3995919, term3995919.getClass(), "lastClientId", "pVNVcilIgB");
        setField(term3995919, term3995919.getClass(), "lastCountryCode", "lnrCaaMXyo");
        setIntField(term3995919, term3995919.getClass(), "eventPoint", -1964639790);
        setIntField(term3995919, term3995919.getClass(), "totalLv", -1209700022);
        setIntField(term3995919, term3995919.getClass(), "lastLoginBonusDay", 1941635181);
        setIntField(term3995919, term3995919.getClass(), "lastSurvivalBonusDay", -274726652);
        setIntField(term3995919, term3995919.getClass(), "loginBonusLv", 1718300718);
        setField(term3995917, term3995917.getClass(), "user", term3995919);
        setIntField(term3995917, term3995917.getClass(), "orderId", 2003280196);
        setLongField(term3995917, term3995917.getClass(), "sortNumber", 8816983876018409286L);
        setIntField(term3995917, term3995917.getClass(), "placeId", -1184687325);
        setField(term3995917, term3995917.getClass(), "placeName", "LsVNgbMfeC");
        setField(term3995917, term3995917.getClass(), "country", "rGIrqxMfxV");
        setIntField(term3995917, term3995917.getClass(), "regionId", 140187882);
        setField(term3995917, term3995917.getClass(), "playDate", "XsiMpwoypW");
        setField(term3995917, term3995917.getClass(), "userPlayDate", "KgQAoTzQmN");
        setIntField(term3995917, term3995917.getClass(), "musicId", -1969750291);
        setIntField(term3995917, term3995917.getClass(), "level", -1449022992);
        setIntField(term3995917, term3995917.getClass(), "gameMode", -274165032);
        setIntField(term3995917, term3995917.getClass(), "rivalNum", -1388472284);
        setIntField(term3995917, term3995917.getClass(), "track", 208317093);
        setIntField(term3995917, term3995917.getClass(), "eventId", -1513837687);
        setBooleanField(term3995917, term3995917.getClass(), "isFreeToPlay", true);
        setIntField(term3995917, term3995917.getClass(), "playerRating", 1363859015);
        setLongField(term3995917, term3995917.getClass(), "playedUserId1", 6754804593311586974L);
        setField(term3995917, term3995917.getClass(), "playedUserName1", "YogEcpWCbw");
        setIntField(term3995917, term3995917.getClass(), "playedMusicLevel1", -1583250163);
        setLongField(term3995917, term3995917.getClass(), "playedUserId2", 7918999404549049178L);
        setField(term3995917, term3995917.getClass(), "playedUserName2", "OYjIHAaMpm");
        setIntField(term3995917, term3995917.getClass(), "playedMusicLevel2", 1653494815);
        setLongField(term3995917, term3995917.getClass(), "playedUserId3", 7650364923014247086L);
        setField(term3995917, term3995917.getClass(), "playedUserName3", "MonoenMpmw");
        setIntField(term3995917, term3995917.getClass(), "playedMusicLevel3", 369778805);
        setIntField(term3995917, term3995917.getClass(), "achievement", -293488003);
        setIntField(term3995917, term3995917.getClass(), "score", -83501911);
        setIntField(term3995917, term3995917.getClass(), "tapScore", -3703186);
        setIntField(term3995917, term3995917.getClass(), "holdScore", 718285772);
        setIntField(term3995917, term3995917.getClass(), "slideScore", -1740816104);
        setIntField(term3995917, term3995917.getClass(), "breakScore", 1731768004);
        setIntField(term3995917, term3995917.getClass(), "syncRate", 828006978);
        setIntField(term3995917, term3995917.getClass(), "vsWin", -462025702);
        setBooleanField(term3995917, term3995917.getClass(), "isAllPerfect", true);
        setIntField(term3995917, term3995917.getClass(), "fullCombo", 1725894065);
        setIntField(term3995917, term3995917.getClass(), "maxFever", 130308187);
        setIntField(term3995917, term3995917.getClass(), "maxCombo", 993174141);
        setIntField(term3995917, term3995917.getClass(), "tapPerfect", -1930201500);
        setIntField(term3995917, term3995917.getClass(), "tapGreat", -1693368682);
        setIntField(term3995917, term3995917.getClass(), "tapGood", 302743611);
        setIntField(term3995917, term3995917.getClass(), "tapBad", -939969018);
        setIntField(term3995917, term3995917.getClass(), "holdPerfect", -2001707671);
        setIntField(term3995917, term3995917.getClass(), "holdGreat", 828742844);
        setIntField(term3995917, term3995917.getClass(), "holdGood", 2081798632);
        setIntField(term3995917, term3995917.getClass(), "holdBad", 952015581);
        setIntField(term3995917, term3995917.getClass(), "slidePerfect", -1705973463);
        setIntField(term3995917, term3995917.getClass(), "slideGreat", 1822643955);
        setIntField(term3995917, term3995917.getClass(), "slideGood", 1640559295);
        setIntField(term3995917, term3995917.getClass(), "slideBad", 732735088);
        setIntField(term3995917, term3995917.getClass(), "breakPerfect", -486104406);
        setIntField(term3995917, term3995917.getClass(), "breakGreat", 911785051);
        setIntField(term3995917, term3995917.getClass(), "breakGood", -1955984034);
        setIntField(term3995917, term3995917.getClass(), "breakBad", 1150584620);
        setBooleanField(term3995917, term3995917.getClass(), "isTrackSkip", false);
        setBooleanField(term3995917, term3995917.getClass(), "isHighScore", true);
        setBooleanField(term3995917, term3995917.getClass(), "isChallengeTrack", false);
        setIntField(term3995917, term3995917.getClass(), "challengeLife", -1461577735);
        setIntField(term3995917, term3995917.getClass(), "challengeRemain", -1800820202);
        setIntField(term3995917, term3995917.getClass(), "isAllPerfectPlus", 1191268163);
        term3996229 = new Integer(1113770838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3996229;
        callMethod(klass, "setChallengeRemain", argTypes, term3995917, args);
    }

};


