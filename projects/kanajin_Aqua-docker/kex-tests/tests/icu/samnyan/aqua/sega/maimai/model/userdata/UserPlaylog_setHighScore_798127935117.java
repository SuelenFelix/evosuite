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
import java.lang.Boolean;

public class UserPlaylog_setHighScore_798127935117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3994495;
     Object term3994807;

    public UserPlaylog_setHighScore_798127935117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3994501 = new Long(-2760323169777751324L);
        term3994495 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3994497 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3994499 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3994515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3994516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3994520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3994525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3994526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3994530 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3994495, term3994495.getClass(), "id", 9060100921696557968L);
        setLongField(term3994497, term3994497.getClass(), "id", 9035439207206435175L);
        setLongField(term3994499, term3994499.getClass(), "id", -7906249019531567046L);
        setField(term3994499, term3994499.getClass(), "extId", term3994501);
        setField(term3994499, term3994499.getClass(), "luid", "bTXZniVANP");
        setIntField(term3994516, term3994516.getClass(), "year", 2014);
        setShortField(term3994516, term3994516.getClass(), "month", (short) 1);
        setShortField(term3994516, term3994516.getClass(), "day", (short) 7);
        setField(term3994515, term3994515.getClass(), "date", term3994516);
        setByteField(term3994520, term3994520.getClass(), "hour", (byte) 19);
        setByteField(term3994520, term3994520.getClass(), "minute", (byte) 26);
        setByteField(term3994520, term3994520.getClass(), "second", (byte) 30);
        setIntField(term3994520, term3994520.getClass(), "nano", 953254724);
        setField(term3994515, term3994515.getClass(), "time", term3994520);
        setField(term3994499, term3994499.getClass(), "registerTime", term3994515);
        setIntField(term3994526, term3994526.getClass(), "year", 2029);
        setShortField(term3994526, term3994526.getClass(), "month", (short) 5);
        setShortField(term3994526, term3994526.getClass(), "day", (short) 8);
        setField(term3994525, term3994525.getClass(), "date", term3994526);
        setByteField(term3994530, term3994530.getClass(), "hour", (byte) 8);
        setByteField(term3994530, term3994530.getClass(), "minute", (byte) 13);
        setByteField(term3994530, term3994530.getClass(), "second", (byte) 2);
        setIntField(term3994530, term3994530.getClass(), "nano", 526433977);
        setField(term3994525, term3994525.getClass(), "time", term3994530);
        setField(term3994499, term3994499.getClass(), "accessTime", term3994525);
        setField(term3994497, term3994497.getClass(), "card", term3994499);
        setIntField(term3994497, term3994497.getClass(), "lastDataVersion", 203360969);
        setField(term3994497, term3994497.getClass(), "userName", "KqFmpdpZfM");
        setIntField(term3994497, term3994497.getClass(), "point", -711464003);
        setIntField(term3994497, term3994497.getClass(), "totalPoint", -1807849960);
        setIntField(term3994497, term3994497.getClass(), "iconId", -731765764);
        setIntField(term3994497, term3994497.getClass(), "nameplateId", -807645865);
        setIntField(term3994497, term3994497.getClass(), "frameId", 9124821);
        setIntField(term3994497, term3994497.getClass(), "trophyId", 1125368690);
        setIntField(term3994497, term3994497.getClass(), "playCount", 121920918);
        setIntField(term3994497, term3994497.getClass(), "playVsCount", -1498245516);
        setIntField(term3994497, term3994497.getClass(), "playSyncCount", 1268423222);
        setIntField(term3994497, term3994497.getClass(), "winCount", -1598507617);
        setIntField(term3994497, term3994497.getClass(), "helpCount", 2079247113);
        setIntField(term3994497, term3994497.getClass(), "comboCount", -915719862);
        setIntField(term3994497, term3994497.getClass(), "feverCount", -1631719583);
        setIntField(term3994497, term3994497.getClass(), "totalHiScore", -2142403709);
        setIntField(term3994497, term3994497.getClass(), "totalEasyHighScore", -1759230197);
        setIntField(term3994497, term3994497.getClass(), "totalBasicHighScore", 1557249673);
        setIntField(term3994497, term3994497.getClass(), "totalAdvancedHighScore", 1580698495);
        setIntField(term3994497, term3994497.getClass(), "totalExpertHighScore", 256485012);
        setIntField(term3994497, term3994497.getClass(), "totalMasterHighScore", -2135896771);
        setIntField(term3994497, term3994497.getClass(), "totalReMasterHighScore", 1585909389);
        setIntField(term3994497, term3994497.getClass(), "totalHighSync", 160001973);
        setIntField(term3994497, term3994497.getClass(), "totalEasySync", 1430092700);
        setIntField(term3994497, term3994497.getClass(), "totalBasicSync", 2053232032);
        setIntField(term3994497, term3994497.getClass(), "totalAdvancedSync", -1243964993);
        setIntField(term3994497, term3994497.getClass(), "totalExpertSync", 1986353340);
        setIntField(term3994497, term3994497.getClass(), "totalMasterSync", 234339261);
        setIntField(term3994497, term3994497.getClass(), "totalReMasterSync", 1952740167);
        setIntField(term3994497, term3994497.getClass(), "playerRating", 1432560442);
        setIntField(term3994497, term3994497.getClass(), "highestRating", 1811570352);
        setIntField(term3994497, term3994497.getClass(), "rankAuthTailId", -1231355467);
        setField(term3994497, term3994497.getClass(), "eventWatchedDate", "ektwbgfPBl");
        setField(term3994497, term3994497.getClass(), "webLimitDate", "vNwblPJJdd");
        setIntField(term3994497, term3994497.getClass(), "challengeTrackPhase", -942003634);
        setIntField(term3994497, term3994497.getClass(), "firstPlayBits", 965153202);
        setField(term3994497, term3994497.getClass(), "lastPlayDate", "ZxphJAQOkT");
        setIntField(term3994497, term3994497.getClass(), "lastPlaceId", -975421913);
        setField(term3994497, term3994497.getClass(), "lastPlaceName", "WgfxhoYItA");
        setIntField(term3994497, term3994497.getClass(), "lastRegionId", -332406941);
        setField(term3994497, term3994497.getClass(), "lastRegionName", "HuRWaouVnp");
        setField(term3994497, term3994497.getClass(), "lastClientId", "qeohGZzZhw");
        setField(term3994497, term3994497.getClass(), "lastCountryCode", "rcVtPhnrGs");
        setIntField(term3994497, term3994497.getClass(), "eventPoint", 135311626);
        setIntField(term3994497, term3994497.getClass(), "totalLv", -927044975);
        setIntField(term3994497, term3994497.getClass(), "lastLoginBonusDay", 1961729669);
        setIntField(term3994497, term3994497.getClass(), "lastSurvivalBonusDay", -133937270);
        setIntField(term3994497, term3994497.getClass(), "loginBonusLv", -120057727);
        setField(term3994495, term3994495.getClass(), "user", term3994497);
        setIntField(term3994495, term3994495.getClass(), "orderId", -1705583774);
        setLongField(term3994495, term3994495.getClass(), "sortNumber", -8483631357871156681L);
        setIntField(term3994495, term3994495.getClass(), "placeId", -1585976947);
        setField(term3994495, term3994495.getClass(), "placeName", "fUZLqyClVT");
        setField(term3994495, term3994495.getClass(), "country", "OajsFyiplQ");
        setIntField(term3994495, term3994495.getClass(), "regionId", -739160109);
        setField(term3994495, term3994495.getClass(), "playDate", "LYVPMxtUoR");
        setField(term3994495, term3994495.getClass(), "userPlayDate", "ITymhMaSvb");
        setIntField(term3994495, term3994495.getClass(), "musicId", 1614141468);
        setIntField(term3994495, term3994495.getClass(), "level", -2111539854);
        setIntField(term3994495, term3994495.getClass(), "gameMode", -1590654917);
        setIntField(term3994495, term3994495.getClass(), "rivalNum", -1968402664);
        setIntField(term3994495, term3994495.getClass(), "track", 40589466);
        setIntField(term3994495, term3994495.getClass(), "eventId", 1762656180);
        setBooleanField(term3994495, term3994495.getClass(), "isFreeToPlay", true);
        setIntField(term3994495, term3994495.getClass(), "playerRating", 1066703058);
        setLongField(term3994495, term3994495.getClass(), "playedUserId1", -2867907423386699863L);
        setField(term3994495, term3994495.getClass(), "playedUserName1", "ulcLIqJQqv");
        setIntField(term3994495, term3994495.getClass(), "playedMusicLevel1", -1629840417);
        setLongField(term3994495, term3994495.getClass(), "playedUserId2", 6216086426728524130L);
        setField(term3994495, term3994495.getClass(), "playedUserName2", "BRyQPonmZS");
        setIntField(term3994495, term3994495.getClass(), "playedMusicLevel2", 1009785416);
        setLongField(term3994495, term3994495.getClass(), "playedUserId3", -8167801772195280287L);
        setField(term3994495, term3994495.getClass(), "playedUserName3", "bkXeznVqKY");
        setIntField(term3994495, term3994495.getClass(), "playedMusicLevel3", -1910635803);
        setIntField(term3994495, term3994495.getClass(), "achievement", 738292272);
        setIntField(term3994495, term3994495.getClass(), "score", -622039260);
        setIntField(term3994495, term3994495.getClass(), "tapScore", 1868628590);
        setIntField(term3994495, term3994495.getClass(), "holdScore", 1201140719);
        setIntField(term3994495, term3994495.getClass(), "slideScore", 8489064);
        setIntField(term3994495, term3994495.getClass(), "breakScore", 1546235739);
        setIntField(term3994495, term3994495.getClass(), "syncRate", -1787306996);
        setIntField(term3994495, term3994495.getClass(), "vsWin", -491577198);
        setBooleanField(term3994495, term3994495.getClass(), "isAllPerfect", true);
        setIntField(term3994495, term3994495.getClass(), "fullCombo", -743799150);
        setIntField(term3994495, term3994495.getClass(), "maxFever", -521787468);
        setIntField(term3994495, term3994495.getClass(), "maxCombo", -2144979002);
        setIntField(term3994495, term3994495.getClass(), "tapPerfect", 1470579265);
        setIntField(term3994495, term3994495.getClass(), "tapGreat", 1348645340);
        setIntField(term3994495, term3994495.getClass(), "tapGood", -318705760);
        setIntField(term3994495, term3994495.getClass(), "tapBad", -2035689700);
        setIntField(term3994495, term3994495.getClass(), "holdPerfect", -622798007);
        setIntField(term3994495, term3994495.getClass(), "holdGreat", -583996955);
        setIntField(term3994495, term3994495.getClass(), "holdGood", -1934621037);
        setIntField(term3994495, term3994495.getClass(), "holdBad", -182446371);
        setIntField(term3994495, term3994495.getClass(), "slidePerfect", -266747336);
        setIntField(term3994495, term3994495.getClass(), "slideGreat", 52157002);
        setIntField(term3994495, term3994495.getClass(), "slideGood", -1266456565);
        setIntField(term3994495, term3994495.getClass(), "slideBad", -1652486947);
        setIntField(term3994495, term3994495.getClass(), "breakPerfect", 1004830588);
        setIntField(term3994495, term3994495.getClass(), "breakGreat", 1733439872);
        setIntField(term3994495, term3994495.getClass(), "breakGood", 313973713);
        setIntField(term3994495, term3994495.getClass(), "breakBad", 1866616037);
        setBooleanField(term3994495, term3994495.getClass(), "isTrackSkip", false);
        setBooleanField(term3994495, term3994495.getClass(), "isHighScore", true);
        setBooleanField(term3994495, term3994495.getClass(), "isChallengeTrack", false);
        setIntField(term3994495, term3994495.getClass(), "challengeLife", 2044551498);
        setIntField(term3994495, term3994495.getClass(), "challengeRemain", -1004605213);
        setIntField(term3994495, term3994495.getClass(), "isAllPerfectPlus", -1181088129);
        term3994807 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3994807;
        callMethod(klass, "setHighScore", argTypes, term3994495, args);
    }

};


