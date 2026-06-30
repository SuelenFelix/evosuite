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

public class UserPlaylog_setPlaceId_63676123365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143341;
     Object term143653;

    public UserPlaylog_setPlaceId_63676123365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143347 = new Long(3931473624300151730L);
        term143341 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term143343 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term143345 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term143361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143366 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143376 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term143341, term143341.getClass(), "id", -6937950410603484933L);
        setLongField(term143343, term143343.getClass(), "id", 4560845347692916950L);
        setLongField(term143345, term143345.getClass(), "id", 310539009137263944L);
        setField(term143345, term143345.getClass(), "extId", term143347);
        setField(term143345, term143345.getClass(), "luid", "GzeLmNKDuY");
        setIntField(term143362, term143362.getClass(), "year", 2010);
        setShortField(term143362, term143362.getClass(), "month", (short) 4);
        setShortField(term143362, term143362.getClass(), "day", (short) 22);
        setField(term143361, term143361.getClass(), "date", term143362);
        setByteField(term143366, term143366.getClass(), "hour", (byte) 16);
        setByteField(term143366, term143366.getClass(), "minute", (byte) 6);
        setByteField(term143366, term143366.getClass(), "second", (byte) 12);
        setIntField(term143366, term143366.getClass(), "nano", 46820039);
        setField(term143361, term143361.getClass(), "time", term143366);
        setField(term143345, term143345.getClass(), "registerTime", term143361);
        setIntField(term143372, term143372.getClass(), "year", 2025);
        setShortField(term143372, term143372.getClass(), "month", (short) 10);
        setShortField(term143372, term143372.getClass(), "day", (short) 24);
        setField(term143371, term143371.getClass(), "date", term143372);
        setByteField(term143376, term143376.getClass(), "hour", (byte) 16);
        setByteField(term143376, term143376.getClass(), "minute", (byte) 37);
        setByteField(term143376, term143376.getClass(), "second", (byte) 14);
        setIntField(term143376, term143376.getClass(), "nano", 973421967);
        setField(term143371, term143371.getClass(), "time", term143376);
        setField(term143345, term143345.getClass(), "accessTime", term143371);
        setField(term143343, term143343.getClass(), "card", term143345);
        setIntField(term143343, term143343.getClass(), "lastDataVersion", -1276675091);
        setField(term143343, term143343.getClass(), "userName", "hPPpARaLPc");
        setIntField(term143343, term143343.getClass(), "point", -1101035418);
        setIntField(term143343, term143343.getClass(), "totalPoint", -452240687);
        setIntField(term143343, term143343.getClass(), "iconId", 1558172934);
        setIntField(term143343, term143343.getClass(), "nameplateId", 1298839615);
        setIntField(term143343, term143343.getClass(), "frameId", -1918351989);
        setIntField(term143343, term143343.getClass(), "trophyId", 1272701520);
        setIntField(term143343, term143343.getClass(), "playCount", -1398992109);
        setIntField(term143343, term143343.getClass(), "playVsCount", -409399250);
        setIntField(term143343, term143343.getClass(), "playSyncCount", 1107569375);
        setIntField(term143343, term143343.getClass(), "winCount", -725804226);
        setIntField(term143343, term143343.getClass(), "helpCount", -1427802140);
        setIntField(term143343, term143343.getClass(), "comboCount", -1873578907);
        setIntField(term143343, term143343.getClass(), "feverCount", -1113311132);
        setIntField(term143343, term143343.getClass(), "totalHiScore", -301733567);
        setIntField(term143343, term143343.getClass(), "totalEasyHighScore", -589850841);
        setIntField(term143343, term143343.getClass(), "totalBasicHighScore", 2108113098);
        setIntField(term143343, term143343.getClass(), "totalAdvancedHighScore", 1645826517);
        setIntField(term143343, term143343.getClass(), "totalExpertHighScore", 463829962);
        setIntField(term143343, term143343.getClass(), "totalMasterHighScore", 530821744);
        setIntField(term143343, term143343.getClass(), "totalReMasterHighScore", -984683276);
        setIntField(term143343, term143343.getClass(), "totalHighSync", 328701966);
        setIntField(term143343, term143343.getClass(), "totalEasySync", -43764304);
        setIntField(term143343, term143343.getClass(), "totalBasicSync", 1982417722);
        setIntField(term143343, term143343.getClass(), "totalAdvancedSync", -1918316581);
        setIntField(term143343, term143343.getClass(), "totalExpertSync", 1204516010);
        setIntField(term143343, term143343.getClass(), "totalMasterSync", -81069572);
        setIntField(term143343, term143343.getClass(), "totalReMasterSync", 508383531);
        setIntField(term143343, term143343.getClass(), "playerRating", 799664846);
        setIntField(term143343, term143343.getClass(), "highestRating", 1300315118);
        setIntField(term143343, term143343.getClass(), "rankAuthTailId", 1494217218);
        setField(term143343, term143343.getClass(), "eventWatchedDate", "DtBDapYLSe");
        setField(term143343, term143343.getClass(), "webLimitDate", "PrJzEmEvlo");
        setIntField(term143343, term143343.getClass(), "challengeTrackPhase", -2037485412);
        setIntField(term143343, term143343.getClass(), "firstPlayBits", -549589079);
        setField(term143343, term143343.getClass(), "lastPlayDate", "DWGWVuqpug");
        setIntField(term143343, term143343.getClass(), "lastPlaceId", 319457509);
        setField(term143343, term143343.getClass(), "lastPlaceName", "MCSpZrEsbC");
        setIntField(term143343, term143343.getClass(), "lastRegionId", -361422672);
        setField(term143343, term143343.getClass(), "lastRegionName", "HisKZVFThP");
        setField(term143343, term143343.getClass(), "lastClientId", "aYnflhXuDg");
        setField(term143343, term143343.getClass(), "lastCountryCode", "CfykLOhTuP");
        setIntField(term143343, term143343.getClass(), "eventPoint", -2135866024);
        setIntField(term143343, term143343.getClass(), "totalLv", -1192954298);
        setIntField(term143343, term143343.getClass(), "lastLoginBonusDay", -2107983925);
        setIntField(term143343, term143343.getClass(), "lastSurvivalBonusDay", 1817073450);
        setIntField(term143343, term143343.getClass(), "loginBonusLv", 1538684322);
        setField(term143341, term143341.getClass(), "user", term143343);
        setIntField(term143341, term143341.getClass(), "orderId", 1265800499);
        setLongField(term143341, term143341.getClass(), "sortNumber", 2625120506837282980L);
        setIntField(term143341, term143341.getClass(), "placeId", -1249500498);
        setField(term143341, term143341.getClass(), "placeName", "pGIHyjmseT");
        setField(term143341, term143341.getClass(), "country", "DFKfoJgHLx");
        setIntField(term143341, term143341.getClass(), "regionId", 1324965525);
        setField(term143341, term143341.getClass(), "playDate", "kbySPSiGhF");
        setField(term143341, term143341.getClass(), "userPlayDate", "sKCjjNeVoI");
        setIntField(term143341, term143341.getClass(), "musicId", 1911093628);
        setIntField(term143341, term143341.getClass(), "level", -1831251547);
        setIntField(term143341, term143341.getClass(), "gameMode", 1390806098);
        setIntField(term143341, term143341.getClass(), "rivalNum", 294546226);
        setIntField(term143341, term143341.getClass(), "track", -1074589146);
        setIntField(term143341, term143341.getClass(), "eventId", -936863059);
        setBooleanField(term143341, term143341.getClass(), "isFreeToPlay", false);
        setIntField(term143341, term143341.getClass(), "playerRating", -136501931);
        setLongField(term143341, term143341.getClass(), "playedUserId1", -3791275881622301002L);
        setField(term143341, term143341.getClass(), "playedUserName1", "HuoMsoUWrV");
        setIntField(term143341, term143341.getClass(), "playedMusicLevel1", 1079782575);
        setLongField(term143341, term143341.getClass(), "playedUserId2", -3269743329730619135L);
        setField(term143341, term143341.getClass(), "playedUserName2", "jCLmdVxyvG");
        setIntField(term143341, term143341.getClass(), "playedMusicLevel2", -1681082907);
        setLongField(term143341, term143341.getClass(), "playedUserId3", 7289941847234084104L);
        setField(term143341, term143341.getClass(), "playedUserName3", "FYniCuCHuO");
        setIntField(term143341, term143341.getClass(), "playedMusicLevel3", -896351319);
        setIntField(term143341, term143341.getClass(), "achievement", -900221037);
        setIntField(term143341, term143341.getClass(), "score", 1067716537);
        setIntField(term143341, term143341.getClass(), "tapScore", -163679227);
        setIntField(term143341, term143341.getClass(), "holdScore", 1219736060);
        setIntField(term143341, term143341.getClass(), "slideScore", -974978101);
        setIntField(term143341, term143341.getClass(), "breakScore", -1344240427);
        setIntField(term143341, term143341.getClass(), "syncRate", 1407194399);
        setIntField(term143341, term143341.getClass(), "vsWin", 1067987457);
        setBooleanField(term143341, term143341.getClass(), "isAllPerfect", true);
        setIntField(term143341, term143341.getClass(), "fullCombo", -1210069630);
        setIntField(term143341, term143341.getClass(), "maxFever", -483893136);
        setIntField(term143341, term143341.getClass(), "maxCombo", -81101921);
        setIntField(term143341, term143341.getClass(), "tapPerfect", 437331772);
        setIntField(term143341, term143341.getClass(), "tapGreat", -652439257);
        setIntField(term143341, term143341.getClass(), "tapGood", 1491052596);
        setIntField(term143341, term143341.getClass(), "tapBad", -1733785472);
        setIntField(term143341, term143341.getClass(), "holdPerfect", 1662847954);
        setIntField(term143341, term143341.getClass(), "holdGreat", -1470955401);
        setIntField(term143341, term143341.getClass(), "holdGood", -417898084);
        setIntField(term143341, term143341.getClass(), "holdBad", -1194653607);
        setIntField(term143341, term143341.getClass(), "slidePerfect", 73757499);
        setIntField(term143341, term143341.getClass(), "slideGreat", -623484638);
        setIntField(term143341, term143341.getClass(), "slideGood", 1426273738);
        setIntField(term143341, term143341.getClass(), "slideBad", 480242845);
        setIntField(term143341, term143341.getClass(), "breakPerfect", -1206549451);
        setIntField(term143341, term143341.getClass(), "breakGreat", -1921601106);
        setIntField(term143341, term143341.getClass(), "breakGood", -117113193);
        setIntField(term143341, term143341.getClass(), "breakBad", -873638626);
        setBooleanField(term143341, term143341.getClass(), "isTrackSkip", false);
        setBooleanField(term143341, term143341.getClass(), "isHighScore", true);
        setBooleanField(term143341, term143341.getClass(), "isChallengeTrack", false);
        setIntField(term143341, term143341.getClass(), "challengeLife", 1185521147);
        setIntField(term143341, term143341.getClass(), "challengeRemain", 561428635);
        setIntField(term143341, term143341.getClass(), "isAllPerfectPlus", 205230316);
        term143653 = new Integer(1345662419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term143653;
        callMethod(klass, "setPlaceId", argTypes, term143341, args);
    }

};


