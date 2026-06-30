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

public class UserPlaylog_getChallengeLife_209807203658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139767;

    public UserPlaylog_getChallengeLife_209807203658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term139773 = new Long(5845993504299821981L);
        term139767 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term139769 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term139771 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term139787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term139797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139802 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term139767, term139767.getClass(), "id", 7842681756773659507L);
        setLongField(term139769, term139769.getClass(), "id", 4491201672462106083L);
        setLongField(term139771, term139771.getClass(), "id", 9035414347228692356L);
        setField(term139771, term139771.getClass(), "extId", term139773);
        setField(term139771, term139771.getClass(), "luid", "HpODnMoCGi");
        setIntField(term139788, term139788.getClass(), "year", 2023);
        setShortField(term139788, term139788.getClass(), "month", (short) 4);
        setShortField(term139788, term139788.getClass(), "day", (short) 2);
        setField(term139787, term139787.getClass(), "date", term139788);
        setByteField(term139792, term139792.getClass(), "hour", (byte) 1);
        setByteField(term139792, term139792.getClass(), "minute", (byte) 39);
        setByteField(term139792, term139792.getClass(), "second", (byte) 47);
        setIntField(term139792, term139792.getClass(), "nano", 89556491);
        setField(term139787, term139787.getClass(), "time", term139792);
        setField(term139771, term139771.getClass(), "registerTime", term139787);
        setIntField(term139798, term139798.getClass(), "year", 2015);
        setShortField(term139798, term139798.getClass(), "month", (short) 1);
        setShortField(term139798, term139798.getClass(), "day", (short) 20);
        setField(term139797, term139797.getClass(), "date", term139798);
        setByteField(term139802, term139802.getClass(), "hour", (byte) 6);
        setByteField(term139802, term139802.getClass(), "minute", (byte) 8);
        setByteField(term139802, term139802.getClass(), "second", (byte) 2);
        setIntField(term139802, term139802.getClass(), "nano", 595295831);
        setField(term139797, term139797.getClass(), "time", term139802);
        setField(term139771, term139771.getClass(), "accessTime", term139797);
        setField(term139769, term139769.getClass(), "card", term139771);
        setIntField(term139769, term139769.getClass(), "lastDataVersion", 210918082);
        setField(term139769, term139769.getClass(), "userName", "QoZOWwrkVW");
        setIntField(term139769, term139769.getClass(), "point", 434146400);
        setIntField(term139769, term139769.getClass(), "totalPoint", 97574163);
        setIntField(term139769, term139769.getClass(), "iconId", -971185051);
        setIntField(term139769, term139769.getClass(), "nameplateId", 399127883);
        setIntField(term139769, term139769.getClass(), "frameId", 764941661);
        setIntField(term139769, term139769.getClass(), "trophyId", 1604092033);
        setIntField(term139769, term139769.getClass(), "playCount", -513324517);
        setIntField(term139769, term139769.getClass(), "playVsCount", -821870990);
        setIntField(term139769, term139769.getClass(), "playSyncCount", -1162456029);
        setIntField(term139769, term139769.getClass(), "winCount", -159817281);
        setIntField(term139769, term139769.getClass(), "helpCount", -1128287307);
        setIntField(term139769, term139769.getClass(), "comboCount", 1885371265);
        setIntField(term139769, term139769.getClass(), "feverCount", 225734051);
        setIntField(term139769, term139769.getClass(), "totalHiScore", -349103263);
        setIntField(term139769, term139769.getClass(), "totalEasyHighScore", -1716968807);
        setIntField(term139769, term139769.getClass(), "totalBasicHighScore", 1180668641);
        setIntField(term139769, term139769.getClass(), "totalAdvancedHighScore", 1171875774);
        setIntField(term139769, term139769.getClass(), "totalExpertHighScore", -168001160);
        setIntField(term139769, term139769.getClass(), "totalMasterHighScore", -1132894503);
        setIntField(term139769, term139769.getClass(), "totalReMasterHighScore", 420722859);
        setIntField(term139769, term139769.getClass(), "totalHighSync", -288498605);
        setIntField(term139769, term139769.getClass(), "totalEasySync", -328437173);
        setIntField(term139769, term139769.getClass(), "totalBasicSync", 434877403);
        setIntField(term139769, term139769.getClass(), "totalAdvancedSync", 105533567);
        setIntField(term139769, term139769.getClass(), "totalExpertSync", -158771080);
        setIntField(term139769, term139769.getClass(), "totalMasterSync", -1774027193);
        setIntField(term139769, term139769.getClass(), "totalReMasterSync", 188046140);
        setIntField(term139769, term139769.getClass(), "playerRating", -797484908);
        setIntField(term139769, term139769.getClass(), "highestRating", -1075844090);
        setIntField(term139769, term139769.getClass(), "rankAuthTailId", -2145936589);
        setField(term139769, term139769.getClass(), "eventWatchedDate", "eGOXSsYDTH");
        setField(term139769, term139769.getClass(), "webLimitDate", "LIheLKvBPl");
        setIntField(term139769, term139769.getClass(), "challengeTrackPhase", 267440625);
        setIntField(term139769, term139769.getClass(), "firstPlayBits", -1953172976);
        setField(term139769, term139769.getClass(), "lastPlayDate", "skbwTMoBkR");
        setIntField(term139769, term139769.getClass(), "lastPlaceId", 391818587);
        setField(term139769, term139769.getClass(), "lastPlaceName", "nyZemBzxeX");
        setIntField(term139769, term139769.getClass(), "lastRegionId", -841066841);
        setField(term139769, term139769.getClass(), "lastRegionName", "mYUsMDfwJF");
        setField(term139769, term139769.getClass(), "lastClientId", "IYNumeLuJm");
        setField(term139769, term139769.getClass(), "lastCountryCode", "baWqGUwddd");
        setIntField(term139769, term139769.getClass(), "eventPoint", -2083429457);
        setIntField(term139769, term139769.getClass(), "totalLv", -2046649702);
        setIntField(term139769, term139769.getClass(), "lastLoginBonusDay", 1416508762);
        setIntField(term139769, term139769.getClass(), "lastSurvivalBonusDay", 506543038);
        setIntField(term139769, term139769.getClass(), "loginBonusLv", -1336657780);
        setField(term139767, term139767.getClass(), "user", term139769);
        setIntField(term139767, term139767.getClass(), "orderId", 1193667372);
        setLongField(term139767, term139767.getClass(), "sortNumber", -6860884095299687457L);
        setIntField(term139767, term139767.getClass(), "placeId", -221358154);
        setField(term139767, term139767.getClass(), "placeName", "ytUYpWefdA");
        setField(term139767, term139767.getClass(), "country", "fdBtFIcFIQ");
        setIntField(term139767, term139767.getClass(), "regionId", -516595702);
        setField(term139767, term139767.getClass(), "playDate", "XixxNbivtN");
        setField(term139767, term139767.getClass(), "userPlayDate", "wOXNBqWiix");
        setIntField(term139767, term139767.getClass(), "musicId", -557215514);
        setIntField(term139767, term139767.getClass(), "level", 2002251821);
        setIntField(term139767, term139767.getClass(), "gameMode", 437164912);
        setIntField(term139767, term139767.getClass(), "rivalNum", -706458680);
        setIntField(term139767, term139767.getClass(), "track", 1062951811);
        setIntField(term139767, term139767.getClass(), "eventId", -909676866);
        setBooleanField(term139767, term139767.getClass(), "isFreeToPlay", true);
        setIntField(term139767, term139767.getClass(), "playerRating", 1051932573);
        setLongField(term139767, term139767.getClass(), "playedUserId1", 7536418221491626978L);
        setField(term139767, term139767.getClass(), "playedUserName1", "inGpCNlqqu");
        setIntField(term139767, term139767.getClass(), "playedMusicLevel1", -569396908);
        setLongField(term139767, term139767.getClass(), "playedUserId2", 8852560867977898159L);
        setField(term139767, term139767.getClass(), "playedUserName2", "PzAzTtIUoU");
        setIntField(term139767, term139767.getClass(), "playedMusicLevel2", 1013221881);
        setLongField(term139767, term139767.getClass(), "playedUserId3", -8478725267603949004L);
        setField(term139767, term139767.getClass(), "playedUserName3", "pltGCOzvHY");
        setIntField(term139767, term139767.getClass(), "playedMusicLevel3", 1923722067);
        setIntField(term139767, term139767.getClass(), "achievement", -1345415060);
        setIntField(term139767, term139767.getClass(), "score", -408639521);
        setIntField(term139767, term139767.getClass(), "tapScore", 1757333328);
        setIntField(term139767, term139767.getClass(), "holdScore", 127436166);
        setIntField(term139767, term139767.getClass(), "slideScore", 730050663);
        setIntField(term139767, term139767.getClass(), "breakScore", 534469982);
        setIntField(term139767, term139767.getClass(), "syncRate", -907905819);
        setIntField(term139767, term139767.getClass(), "vsWin", -1500119769);
        setBooleanField(term139767, term139767.getClass(), "isAllPerfect", false);
        setIntField(term139767, term139767.getClass(), "fullCombo", -1417307655);
        setIntField(term139767, term139767.getClass(), "maxFever", 240874437);
        setIntField(term139767, term139767.getClass(), "maxCombo", 370086289);
        setIntField(term139767, term139767.getClass(), "tapPerfect", 119174295);
        setIntField(term139767, term139767.getClass(), "tapGreat", 1966165296);
        setIntField(term139767, term139767.getClass(), "tapGood", 304905588);
        setIntField(term139767, term139767.getClass(), "tapBad", 1232105225);
        setIntField(term139767, term139767.getClass(), "holdPerfect", 1494500438);
        setIntField(term139767, term139767.getClass(), "holdGreat", 258371010);
        setIntField(term139767, term139767.getClass(), "holdGood", 1003310321);
        setIntField(term139767, term139767.getClass(), "holdBad", 93804935);
        setIntField(term139767, term139767.getClass(), "slidePerfect", 353661913);
        setIntField(term139767, term139767.getClass(), "slideGreat", 1326478677);
        setIntField(term139767, term139767.getClass(), "slideGood", -834401320);
        setIntField(term139767, term139767.getClass(), "slideBad", -1159555670);
        setIntField(term139767, term139767.getClass(), "breakPerfect", -1202869344);
        setIntField(term139767, term139767.getClass(), "breakGreat", -224281094);
        setIntField(term139767, term139767.getClass(), "breakGood", 665079055);
        setIntField(term139767, term139767.getClass(), "breakBad", -35694438);
        setBooleanField(term139767, term139767.getClass(), "isTrackSkip", true);
        setBooleanField(term139767, term139767.getClass(), "isHighScore", false);
        setBooleanField(term139767, term139767.getClass(), "isChallengeTrack", true);
        setIntField(term139767, term139767.getClass(), "challengeLife", -1010322296);
        setIntField(term139767, term139767.getClass(), "challengeRemain", -925486854);
        setIntField(term139767, term139767.getClass(), "isAllPerfectPlus", 1067945533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeLife", argTypes, term139767, args);
    }

};


