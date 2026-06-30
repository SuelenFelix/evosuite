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

public class UserPlaylog_setLevel_34895937972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146739;
     Object term147051;

    public UserPlaylog_setLevel_34895937972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146745 = new Long(4096288569907305445L);
        term146739 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term146741 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term146743 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146769 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146774 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term146739, term146739.getClass(), "id", -6694319636219671027L);
        setLongField(term146741, term146741.getClass(), "id", -3473081969778151336L);
        setLongField(term146743, term146743.getClass(), "id", 6622018619505451280L);
        setField(term146743, term146743.getClass(), "extId", term146745);
        setField(term146743, term146743.getClass(), "luid", "AwXWFyuuXB");
        setIntField(term146760, term146760.getClass(), "year", 2027);
        setShortField(term146760, term146760.getClass(), "month", (short) 8);
        setShortField(term146760, term146760.getClass(), "day", (short) 28);
        setField(term146759, term146759.getClass(), "date", term146760);
        setByteField(term146764, term146764.getClass(), "hour", (byte) 18);
        setByteField(term146764, term146764.getClass(), "minute", (byte) 28);
        setByteField(term146764, term146764.getClass(), "second", (byte) 45);
        setIntField(term146764, term146764.getClass(), "nano", 351559461);
        setField(term146759, term146759.getClass(), "time", term146764);
        setField(term146743, term146743.getClass(), "registerTime", term146759);
        setIntField(term146770, term146770.getClass(), "year", 2016);
        setShortField(term146770, term146770.getClass(), "month", (short) 9);
        setShortField(term146770, term146770.getClass(), "day", (short) 28);
        setField(term146769, term146769.getClass(), "date", term146770);
        setByteField(term146774, term146774.getClass(), "hour", (byte) 13);
        setByteField(term146774, term146774.getClass(), "minute", (byte) 19);
        setByteField(term146774, term146774.getClass(), "second", (byte) 21);
        setIntField(term146774, term146774.getClass(), "nano", 258693118);
        setField(term146769, term146769.getClass(), "time", term146774);
        setField(term146743, term146743.getClass(), "accessTime", term146769);
        setField(term146741, term146741.getClass(), "card", term146743);
        setIntField(term146741, term146741.getClass(), "lastDataVersion", 1761582120);
        setField(term146741, term146741.getClass(), "userName", "hHUEukVMwn");
        setIntField(term146741, term146741.getClass(), "point", 1749916121);
        setIntField(term146741, term146741.getClass(), "totalPoint", -129039692);
        setIntField(term146741, term146741.getClass(), "iconId", -432401292);
        setIntField(term146741, term146741.getClass(), "nameplateId", 1892382347);
        setIntField(term146741, term146741.getClass(), "frameId", 1760177073);
        setIntField(term146741, term146741.getClass(), "trophyId", 1230011819);
        setIntField(term146741, term146741.getClass(), "playCount", 1872182894);
        setIntField(term146741, term146741.getClass(), "playVsCount", 89211811);
        setIntField(term146741, term146741.getClass(), "playSyncCount", -1025816435);
        setIntField(term146741, term146741.getClass(), "winCount", -1792616669);
        setIntField(term146741, term146741.getClass(), "helpCount", 912810766);
        setIntField(term146741, term146741.getClass(), "comboCount", 1069241403);
        setIntField(term146741, term146741.getClass(), "feverCount", -1576450967);
        setIntField(term146741, term146741.getClass(), "totalHiScore", 1181782085);
        setIntField(term146741, term146741.getClass(), "totalEasyHighScore", 771057042);
        setIntField(term146741, term146741.getClass(), "totalBasicHighScore", -2090879041);
        setIntField(term146741, term146741.getClass(), "totalAdvancedHighScore", -1539159480);
        setIntField(term146741, term146741.getClass(), "totalExpertHighScore", 795327405);
        setIntField(term146741, term146741.getClass(), "totalMasterHighScore", 822701990);
        setIntField(term146741, term146741.getClass(), "totalReMasterHighScore", -1022772429);
        setIntField(term146741, term146741.getClass(), "totalHighSync", 42246672);
        setIntField(term146741, term146741.getClass(), "totalEasySync", -8611964);
        setIntField(term146741, term146741.getClass(), "totalBasicSync", 1571062758);
        setIntField(term146741, term146741.getClass(), "totalAdvancedSync", -1628970138);
        setIntField(term146741, term146741.getClass(), "totalExpertSync", -569577294);
        setIntField(term146741, term146741.getClass(), "totalMasterSync", 959919310);
        setIntField(term146741, term146741.getClass(), "totalReMasterSync", -1680526175);
        setIntField(term146741, term146741.getClass(), "playerRating", -568142234);
        setIntField(term146741, term146741.getClass(), "highestRating", 1782961805);
        setIntField(term146741, term146741.getClass(), "rankAuthTailId", 297517056);
        setField(term146741, term146741.getClass(), "eventWatchedDate", "yvAOmWOExs");
        setField(term146741, term146741.getClass(), "webLimitDate", "DmsJwEkQmO");
        setIntField(term146741, term146741.getClass(), "challengeTrackPhase", -491748640);
        setIntField(term146741, term146741.getClass(), "firstPlayBits", -1904941002);
        setField(term146741, term146741.getClass(), "lastPlayDate", "HzibsEDFOp");
        setIntField(term146741, term146741.getClass(), "lastPlaceId", 1453887508);
        setField(term146741, term146741.getClass(), "lastPlaceName", "nxccuKoVbt");
        setIntField(term146741, term146741.getClass(), "lastRegionId", -1527628075);
        setField(term146741, term146741.getClass(), "lastRegionName", "fgSbKLymzA");
        setField(term146741, term146741.getClass(), "lastClientId", "kSFJgZpdtf");
        setField(term146741, term146741.getClass(), "lastCountryCode", "ujNUCJKMUq");
        setIntField(term146741, term146741.getClass(), "eventPoint", -113628762);
        setIntField(term146741, term146741.getClass(), "totalLv", 895565502);
        setIntField(term146741, term146741.getClass(), "lastLoginBonusDay", 175406253);
        setIntField(term146741, term146741.getClass(), "lastSurvivalBonusDay", 1477171041);
        setIntField(term146741, term146741.getClass(), "loginBonusLv", 91216248);
        setField(term146739, term146739.getClass(), "user", term146741);
        setIntField(term146739, term146739.getClass(), "orderId", 623165698);
        setLongField(term146739, term146739.getClass(), "sortNumber", 1984951428829541736L);
        setIntField(term146739, term146739.getClass(), "placeId", -501370916);
        setField(term146739, term146739.getClass(), "placeName", "oQFejbSARv");
        setField(term146739, term146739.getClass(), "country", "DzSvjuoClh");
        setIntField(term146739, term146739.getClass(), "regionId", 1563227237);
        setField(term146739, term146739.getClass(), "playDate", "mKfcJwCzHA");
        setField(term146739, term146739.getClass(), "userPlayDate", "aAolDGKlZL");
        setIntField(term146739, term146739.getClass(), "musicId", -842127329);
        setIntField(term146739, term146739.getClass(), "level", -764787306);
        setIntField(term146739, term146739.getClass(), "gameMode", -105844576);
        setIntField(term146739, term146739.getClass(), "rivalNum", -542844187);
        setIntField(term146739, term146739.getClass(), "track", -1177667412);
        setIntField(term146739, term146739.getClass(), "eventId", 1248769105);
        setBooleanField(term146739, term146739.getClass(), "isFreeToPlay", true);
        setIntField(term146739, term146739.getClass(), "playerRating", 443403037);
        setLongField(term146739, term146739.getClass(), "playedUserId1", 281955242959047454L);
        setField(term146739, term146739.getClass(), "playedUserName1", "QowFnXBGSJ");
        setIntField(term146739, term146739.getClass(), "playedMusicLevel1", 361792760);
        setLongField(term146739, term146739.getClass(), "playedUserId2", 863677123934073271L);
        setField(term146739, term146739.getClass(), "playedUserName2", "KZIClWErQV");
        setIntField(term146739, term146739.getClass(), "playedMusicLevel2", 944201659);
        setLongField(term146739, term146739.getClass(), "playedUserId3", -3863836475734251469L);
        setField(term146739, term146739.getClass(), "playedUserName3", "NlMAkCBTMT");
        setIntField(term146739, term146739.getClass(), "playedMusicLevel3", -354873535);
        setIntField(term146739, term146739.getClass(), "achievement", -222455686);
        setIntField(term146739, term146739.getClass(), "score", 55563742);
        setIntField(term146739, term146739.getClass(), "tapScore", -1617934340);
        setIntField(term146739, term146739.getClass(), "holdScore", -1202350370);
        setIntField(term146739, term146739.getClass(), "slideScore", -793206516);
        setIntField(term146739, term146739.getClass(), "breakScore", 873560919);
        setIntField(term146739, term146739.getClass(), "syncRate", -17868049);
        setIntField(term146739, term146739.getClass(), "vsWin", 373456257);
        setBooleanField(term146739, term146739.getClass(), "isAllPerfect", true);
        setIntField(term146739, term146739.getClass(), "fullCombo", 114867379);
        setIntField(term146739, term146739.getClass(), "maxFever", -1440018382);
        setIntField(term146739, term146739.getClass(), "maxCombo", -610110994);
        setIntField(term146739, term146739.getClass(), "tapPerfect", -743449066);
        setIntField(term146739, term146739.getClass(), "tapGreat", -225766012);
        setIntField(term146739, term146739.getClass(), "tapGood", 1194873891);
        setIntField(term146739, term146739.getClass(), "tapBad", -507374736);
        setIntField(term146739, term146739.getClass(), "holdPerfect", 400288272);
        setIntField(term146739, term146739.getClass(), "holdGreat", 860418216);
        setIntField(term146739, term146739.getClass(), "holdGood", 1884654809);
        setIntField(term146739, term146739.getClass(), "holdBad", 449101963);
        setIntField(term146739, term146739.getClass(), "slidePerfect", 2104459933);
        setIntField(term146739, term146739.getClass(), "slideGreat", 150577539);
        setIntField(term146739, term146739.getClass(), "slideGood", -1686739888);
        setIntField(term146739, term146739.getClass(), "slideBad", -190114118);
        setIntField(term146739, term146739.getClass(), "breakPerfect", -548490981);
        setIntField(term146739, term146739.getClass(), "breakGreat", 2011040536);
        setIntField(term146739, term146739.getClass(), "breakGood", 823908451);
        setIntField(term146739, term146739.getClass(), "breakBad", 103139808);
        setBooleanField(term146739, term146739.getClass(), "isTrackSkip", false);
        setBooleanField(term146739, term146739.getClass(), "isHighScore", false);
        setBooleanField(term146739, term146739.getClass(), "isChallengeTrack", false);
        setIntField(term146739, term146739.getClass(), "challengeLife", -283921719);
        setIntField(term146739, term146739.getClass(), "challengeRemain", -915909717);
        setIntField(term146739, term146739.getClass(), "isAllPerfectPlus", 113315748);
        term147051 = new Integer(26393228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term147051;
        callMethod(klass, "setLevel", argTypes, term146739, args);
    }

};


