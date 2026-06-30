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

public class UserPlaylog_setSlideBad_1155879833111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165285;
     Object term165597;

    public UserPlaylog_setSlideBad_1155879833111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165291 = new Long(3824691451696451167L);
        term165285 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term165287 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term165289 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term165305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165310 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165320 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term165285, term165285.getClass(), "id", -2670369629600189900L);
        setLongField(term165287, term165287.getClass(), "id", -177713589369472164L);
        setLongField(term165289, term165289.getClass(), "id", 792816556387097064L);
        setField(term165289, term165289.getClass(), "extId", term165291);
        setField(term165289, term165289.getClass(), "luid", "eKayOnVsvF");
        setIntField(term165306, term165306.getClass(), "year", 2025);
        setShortField(term165306, term165306.getClass(), "month", (short) 4);
        setShortField(term165306, term165306.getClass(), "day", (short) 11);
        setField(term165305, term165305.getClass(), "date", term165306);
        setByteField(term165310, term165310.getClass(), "hour", (byte) 5);
        setByteField(term165310, term165310.getClass(), "minute", (byte) 16);
        setByteField(term165310, term165310.getClass(), "second", (byte) 25);
        setIntField(term165310, term165310.getClass(), "nano", 178363433);
        setField(term165305, term165305.getClass(), "time", term165310);
        setField(term165289, term165289.getClass(), "registerTime", term165305);
        setIntField(term165316, term165316.getClass(), "year", 2025);
        setShortField(term165316, term165316.getClass(), "month", (short) 8);
        setShortField(term165316, term165316.getClass(), "day", (short) 12);
        setField(term165315, term165315.getClass(), "date", term165316);
        setByteField(term165320, term165320.getClass(), "hour", (byte) 13);
        setByteField(term165320, term165320.getClass(), "minute", (byte) 18);
        setByteField(term165320, term165320.getClass(), "second", (byte) 4);
        setIntField(term165320, term165320.getClass(), "nano", 550437598);
        setField(term165315, term165315.getClass(), "time", term165320);
        setField(term165289, term165289.getClass(), "accessTime", term165315);
        setField(term165287, term165287.getClass(), "card", term165289);
        setIntField(term165287, term165287.getClass(), "lastDataVersion", 1370513939);
        setField(term165287, term165287.getClass(), "userName", "SWDyPmvaFP");
        setIntField(term165287, term165287.getClass(), "point", 72664010);
        setIntField(term165287, term165287.getClass(), "totalPoint", 51271160);
        setIntField(term165287, term165287.getClass(), "iconId", 1330928485);
        setIntField(term165287, term165287.getClass(), "nameplateId", -138533099);
        setIntField(term165287, term165287.getClass(), "frameId", 125491109);
        setIntField(term165287, term165287.getClass(), "trophyId", -355535555);
        setIntField(term165287, term165287.getClass(), "playCount", -1225175166);
        setIntField(term165287, term165287.getClass(), "playVsCount", 814963685);
        setIntField(term165287, term165287.getClass(), "playSyncCount", 1215057654);
        setIntField(term165287, term165287.getClass(), "winCount", -237814174);
        setIntField(term165287, term165287.getClass(), "helpCount", 1438844134);
        setIntField(term165287, term165287.getClass(), "comboCount", 1797221677);
        setIntField(term165287, term165287.getClass(), "feverCount", 441970507);
        setIntField(term165287, term165287.getClass(), "totalHiScore", -798959201);
        setIntField(term165287, term165287.getClass(), "totalEasyHighScore", -1784315736);
        setIntField(term165287, term165287.getClass(), "totalBasicHighScore", 860232941);
        setIntField(term165287, term165287.getClass(), "totalAdvancedHighScore", 1058027477);
        setIntField(term165287, term165287.getClass(), "totalExpertHighScore", 67229816);
        setIntField(term165287, term165287.getClass(), "totalMasterHighScore", 710175634);
        setIntField(term165287, term165287.getClass(), "totalReMasterHighScore", -1500563280);
        setIntField(term165287, term165287.getClass(), "totalHighSync", -2088850030);
        setIntField(term165287, term165287.getClass(), "totalEasySync", 1815378190);
        setIntField(term165287, term165287.getClass(), "totalBasicSync", -1694059299);
        setIntField(term165287, term165287.getClass(), "totalAdvancedSync", -446759169);
        setIntField(term165287, term165287.getClass(), "totalExpertSync", -1094892115);
        setIntField(term165287, term165287.getClass(), "totalMasterSync", -1979495758);
        setIntField(term165287, term165287.getClass(), "totalReMasterSync", 394992958);
        setIntField(term165287, term165287.getClass(), "playerRating", -515184614);
        setIntField(term165287, term165287.getClass(), "highestRating", -160329180);
        setIntField(term165287, term165287.getClass(), "rankAuthTailId", 1143113658);
        setField(term165287, term165287.getClass(), "eventWatchedDate", "NRIcMTUDMt");
        setField(term165287, term165287.getClass(), "webLimitDate", "QbaWBJMCRe");
        setIntField(term165287, term165287.getClass(), "challengeTrackPhase", -18092507);
        setIntField(term165287, term165287.getClass(), "firstPlayBits", -1306147355);
        setField(term165287, term165287.getClass(), "lastPlayDate", "JQpscjYgTt");
        setIntField(term165287, term165287.getClass(), "lastPlaceId", -2036624213);
        setField(term165287, term165287.getClass(), "lastPlaceName", "RLNPkJhVuK");
        setIntField(term165287, term165287.getClass(), "lastRegionId", -844580712);
        setField(term165287, term165287.getClass(), "lastRegionName", "KqEJftTXuU");
        setField(term165287, term165287.getClass(), "lastClientId", "msSGXFHEfu");
        setField(term165287, term165287.getClass(), "lastCountryCode", "AtdQbyrrjU");
        setIntField(term165287, term165287.getClass(), "eventPoint", -1392484029);
        setIntField(term165287, term165287.getClass(), "totalLv", -1516671200);
        setIntField(term165287, term165287.getClass(), "lastLoginBonusDay", -1044096048);
        setIntField(term165287, term165287.getClass(), "lastSurvivalBonusDay", -800721881);
        setIntField(term165287, term165287.getClass(), "loginBonusLv", 1026456653);
        setField(term165285, term165285.getClass(), "user", term165287);
        setIntField(term165285, term165285.getClass(), "orderId", -405575205);
        setLongField(term165285, term165285.getClass(), "sortNumber", 5391287373597316604L);
        setIntField(term165285, term165285.getClass(), "placeId", -1634283937);
        setField(term165285, term165285.getClass(), "placeName", "qWfJfYLLPv");
        setField(term165285, term165285.getClass(), "country", "VZbUjcRZMe");
        setIntField(term165285, term165285.getClass(), "regionId", -717336248);
        setField(term165285, term165285.getClass(), "playDate", "gDouKwsHFO");
        setField(term165285, term165285.getClass(), "userPlayDate", "LOXLADrcBI");
        setIntField(term165285, term165285.getClass(), "musicId", 1267229952);
        setIntField(term165285, term165285.getClass(), "level", 36522280);
        setIntField(term165285, term165285.getClass(), "gameMode", 1672431879);
        setIntField(term165285, term165285.getClass(), "rivalNum", 2141281709);
        setIntField(term165285, term165285.getClass(), "track", -157519516);
        setIntField(term165285, term165285.getClass(), "eventId", -2045726191);
        setBooleanField(term165285, term165285.getClass(), "isFreeToPlay", true);
        setIntField(term165285, term165285.getClass(), "playerRating", 1880420925);
        setLongField(term165285, term165285.getClass(), "playedUserId1", 6929574138600777534L);
        setField(term165285, term165285.getClass(), "playedUserName1", "BRVeCzWPKZ");
        setIntField(term165285, term165285.getClass(), "playedMusicLevel1", -142496268);
        setLongField(term165285, term165285.getClass(), "playedUserId2", 7306228148506563384L);
        setField(term165285, term165285.getClass(), "playedUserName2", "iVfYVgPFch");
        setIntField(term165285, term165285.getClass(), "playedMusicLevel2", -1677756333);
        setLongField(term165285, term165285.getClass(), "playedUserId3", -3759875741196067125L);
        setField(term165285, term165285.getClass(), "playedUserName3", "ZaImFGAzCz");
        setIntField(term165285, term165285.getClass(), "playedMusicLevel3", 1239563212);
        setIntField(term165285, term165285.getClass(), "achievement", -124131233);
        setIntField(term165285, term165285.getClass(), "score", -1232282889);
        setIntField(term165285, term165285.getClass(), "tapScore", -468900292);
        setIntField(term165285, term165285.getClass(), "holdScore", 1388158765);
        setIntField(term165285, term165285.getClass(), "slideScore", -158487011);
        setIntField(term165285, term165285.getClass(), "breakScore", 462782562);
        setIntField(term165285, term165285.getClass(), "syncRate", -1764599260);
        setIntField(term165285, term165285.getClass(), "vsWin", 1132521819);
        setBooleanField(term165285, term165285.getClass(), "isAllPerfect", false);
        setIntField(term165285, term165285.getClass(), "fullCombo", 1426028820);
        setIntField(term165285, term165285.getClass(), "maxFever", -106557307);
        setIntField(term165285, term165285.getClass(), "maxCombo", -1865298195);
        setIntField(term165285, term165285.getClass(), "tapPerfect", 1196139974);
        setIntField(term165285, term165285.getClass(), "tapGreat", 1300514491);
        setIntField(term165285, term165285.getClass(), "tapGood", 156012906);
        setIntField(term165285, term165285.getClass(), "tapBad", -1298950949);
        setIntField(term165285, term165285.getClass(), "holdPerfect", 1987195736);
        setIntField(term165285, term165285.getClass(), "holdGreat", -1504781438);
        setIntField(term165285, term165285.getClass(), "holdGood", 1430034218);
        setIntField(term165285, term165285.getClass(), "holdBad", 1173626707);
        setIntField(term165285, term165285.getClass(), "slidePerfect", -1472939798);
        setIntField(term165285, term165285.getClass(), "slideGreat", 1336283191);
        setIntField(term165285, term165285.getClass(), "slideGood", -1620701316);
        setIntField(term165285, term165285.getClass(), "slideBad", -2010125595);
        setIntField(term165285, term165285.getClass(), "breakPerfect", 881618169);
        setIntField(term165285, term165285.getClass(), "breakGreat", -2002251348);
        setIntField(term165285, term165285.getClass(), "breakGood", 1450488462);
        setIntField(term165285, term165285.getClass(), "breakBad", -1946878069);
        setBooleanField(term165285, term165285.getClass(), "isTrackSkip", false);
        setBooleanField(term165285, term165285.getClass(), "isHighScore", false);
        setBooleanField(term165285, term165285.getClass(), "isChallengeTrack", false);
        setIntField(term165285, term165285.getClass(), "challengeLife", -10935143);
        setIntField(term165285, term165285.getClass(), "challengeRemain", -250644841);
        setIntField(term165285, term165285.getClass(), "isAllPerfectPlus", 513092887);
        term165597 = new Integer(-1147940046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term165597;
        callMethod(klass, "setSlideBad", argTypes, term165285, args);
    }

};


