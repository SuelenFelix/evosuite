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

public class UserPlaylog_setAchievement_121851059488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154383;
     Object term154695;

    public UserPlaylog_setAchievement_121851059488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term154389 = new Long(-7506365302323354325L);
        term154383 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term154385 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term154387 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term154403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term154413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154418 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term154383, term154383.getClass(), "id", -4012171283483306843L);
        setLongField(term154385, term154385.getClass(), "id", -8117956180112977495L);
        setLongField(term154387, term154387.getClass(), "id", 342373123317498636L);
        setField(term154387, term154387.getClass(), "extId", term154389);
        setField(term154387, term154387.getClass(), "luid", "YphZwwGqEI");
        setIntField(term154404, term154404.getClass(), "year", 2012);
        setShortField(term154404, term154404.getClass(), "month", (short) 5);
        setShortField(term154404, term154404.getClass(), "day", (short) 5);
        setField(term154403, term154403.getClass(), "date", term154404);
        setByteField(term154408, term154408.getClass(), "hour", (byte) 9);
        setByteField(term154408, term154408.getClass(), "minute", (byte) 8);
        setByteField(term154408, term154408.getClass(), "second", (byte) 40);
        setIntField(term154408, term154408.getClass(), "nano", 919436445);
        setField(term154403, term154403.getClass(), "time", term154408);
        setField(term154387, term154387.getClass(), "registerTime", term154403);
        setIntField(term154414, term154414.getClass(), "year", 2015);
        setShortField(term154414, term154414.getClass(), "month", (short) 11);
        setShortField(term154414, term154414.getClass(), "day", (short) 3);
        setField(term154413, term154413.getClass(), "date", term154414);
        setByteField(term154418, term154418.getClass(), "hour", (byte) 5);
        setByteField(term154418, term154418.getClass(), "minute", (byte) 27);
        setByteField(term154418, term154418.getClass(), "second", (byte) 14);
        setIntField(term154418, term154418.getClass(), "nano", 150694068);
        setField(term154413, term154413.getClass(), "time", term154418);
        setField(term154387, term154387.getClass(), "accessTime", term154413);
        setField(term154385, term154385.getClass(), "card", term154387);
        setIntField(term154385, term154385.getClass(), "lastDataVersion", -714180213);
        setField(term154385, term154385.getClass(), "userName", "SMpEesDFbN");
        setIntField(term154385, term154385.getClass(), "point", -655900902);
        setIntField(term154385, term154385.getClass(), "totalPoint", -667551572);
        setIntField(term154385, term154385.getClass(), "iconId", 92818196);
        setIntField(term154385, term154385.getClass(), "nameplateId", -1505250714);
        setIntField(term154385, term154385.getClass(), "frameId", 1504281371);
        setIntField(term154385, term154385.getClass(), "trophyId", 567809344);
        setIntField(term154385, term154385.getClass(), "playCount", 625901286);
        setIntField(term154385, term154385.getClass(), "playVsCount", 1346970976);
        setIntField(term154385, term154385.getClass(), "playSyncCount", -1856255868);
        setIntField(term154385, term154385.getClass(), "winCount", 690818772);
        setIntField(term154385, term154385.getClass(), "helpCount", -1927492779);
        setIntField(term154385, term154385.getClass(), "comboCount", -1303981582);
        setIntField(term154385, term154385.getClass(), "feverCount", -2082469614);
        setIntField(term154385, term154385.getClass(), "totalHiScore", -1658261170);
        setIntField(term154385, term154385.getClass(), "totalEasyHighScore", 1887898657);
        setIntField(term154385, term154385.getClass(), "totalBasicHighScore", 571611857);
        setIntField(term154385, term154385.getClass(), "totalAdvancedHighScore", -1017883695);
        setIntField(term154385, term154385.getClass(), "totalExpertHighScore", 191218168);
        setIntField(term154385, term154385.getClass(), "totalMasterHighScore", 96951862);
        setIntField(term154385, term154385.getClass(), "totalReMasterHighScore", -974809266);
        setIntField(term154385, term154385.getClass(), "totalHighSync", 558582959);
        setIntField(term154385, term154385.getClass(), "totalEasySync", -1727379065);
        setIntField(term154385, term154385.getClass(), "totalBasicSync", 1295104869);
        setIntField(term154385, term154385.getClass(), "totalAdvancedSync", 7476990);
        setIntField(term154385, term154385.getClass(), "totalExpertSync", -187952821);
        setIntField(term154385, term154385.getClass(), "totalMasterSync", -2084242855);
        setIntField(term154385, term154385.getClass(), "totalReMasterSync", -1516692137);
        setIntField(term154385, term154385.getClass(), "playerRating", 1313192861);
        setIntField(term154385, term154385.getClass(), "highestRating", -1767172334);
        setIntField(term154385, term154385.getClass(), "rankAuthTailId", -40339714);
        setField(term154385, term154385.getClass(), "eventWatchedDate", "Nmrdnhkhse");
        setField(term154385, term154385.getClass(), "webLimitDate", "NUcoviagVt");
        setIntField(term154385, term154385.getClass(), "challengeTrackPhase", -1662035010);
        setIntField(term154385, term154385.getClass(), "firstPlayBits", -1418703569);
        setField(term154385, term154385.getClass(), "lastPlayDate", "LfJIjYgLRK");
        setIntField(term154385, term154385.getClass(), "lastPlaceId", 357193357);
        setField(term154385, term154385.getClass(), "lastPlaceName", "ctTLYxopUg");
        setIntField(term154385, term154385.getClass(), "lastRegionId", 638287098);
        setField(term154385, term154385.getClass(), "lastRegionName", "tccghjUmdc");
        setField(term154385, term154385.getClass(), "lastClientId", "iCaFATAsAC");
        setField(term154385, term154385.getClass(), "lastCountryCode", "HPWJMPlVFI");
        setIntField(term154385, term154385.getClass(), "eventPoint", 2068330956);
        setIntField(term154385, term154385.getClass(), "totalLv", -2133447577);
        setIntField(term154385, term154385.getClass(), "lastLoginBonusDay", -220178445);
        setIntField(term154385, term154385.getClass(), "lastSurvivalBonusDay", -735692856);
        setIntField(term154385, term154385.getClass(), "loginBonusLv", -604285208);
        setField(term154383, term154383.getClass(), "user", term154385);
        setIntField(term154383, term154383.getClass(), "orderId", 1406502733);
        setLongField(term154383, term154383.getClass(), "sortNumber", -6848455207927551525L);
        setIntField(term154383, term154383.getClass(), "placeId", 457897221);
        setField(term154383, term154383.getClass(), "placeName", "ChicGOdcQQ");
        setField(term154383, term154383.getClass(), "country", "RDbCrwuOqx");
        setIntField(term154383, term154383.getClass(), "regionId", 583221280);
        setField(term154383, term154383.getClass(), "playDate", "GpKiABHvoe");
        setField(term154383, term154383.getClass(), "userPlayDate", "csdvKvMKzx");
        setIntField(term154383, term154383.getClass(), "musicId", 2082993823);
        setIntField(term154383, term154383.getClass(), "level", 116896794);
        setIntField(term154383, term154383.getClass(), "gameMode", 1231807515);
        setIntField(term154383, term154383.getClass(), "rivalNum", 1281018748);
        setIntField(term154383, term154383.getClass(), "track", -1567042600);
        setIntField(term154383, term154383.getClass(), "eventId", -1851599258);
        setBooleanField(term154383, term154383.getClass(), "isFreeToPlay", true);
        setIntField(term154383, term154383.getClass(), "playerRating", 1297768569);
        setLongField(term154383, term154383.getClass(), "playedUserId1", -7429834768466188126L);
        setField(term154383, term154383.getClass(), "playedUserName1", "xfyCONULzw");
        setIntField(term154383, term154383.getClass(), "playedMusicLevel1", 819122136);
        setLongField(term154383, term154383.getClass(), "playedUserId2", 2537051314451371644L);
        setField(term154383, term154383.getClass(), "playedUserName2", "SmpXEpmGyR");
        setIntField(term154383, term154383.getClass(), "playedMusicLevel2", 171275083);
        setLongField(term154383, term154383.getClass(), "playedUserId3", 1503652575237136976L);
        setField(term154383, term154383.getClass(), "playedUserName3", "foXieiGQTk");
        setIntField(term154383, term154383.getClass(), "playedMusicLevel3", 1029583492);
        setIntField(term154383, term154383.getClass(), "achievement", 496403430);
        setIntField(term154383, term154383.getClass(), "score", -1220075590);
        setIntField(term154383, term154383.getClass(), "tapScore", -1726895820);
        setIntField(term154383, term154383.getClass(), "holdScore", -478293204);
        setIntField(term154383, term154383.getClass(), "slideScore", 991962495);
        setIntField(term154383, term154383.getClass(), "breakScore", 996721265);
        setIntField(term154383, term154383.getClass(), "syncRate", -234666429);
        setIntField(term154383, term154383.getClass(), "vsWin", 1815111003);
        setBooleanField(term154383, term154383.getClass(), "isAllPerfect", false);
        setIntField(term154383, term154383.getClass(), "fullCombo", -1407430200);
        setIntField(term154383, term154383.getClass(), "maxFever", -96203616);
        setIntField(term154383, term154383.getClass(), "maxCombo", -793698346);
        setIntField(term154383, term154383.getClass(), "tapPerfect", 708079222);
        setIntField(term154383, term154383.getClass(), "tapGreat", -137252861);
        setIntField(term154383, term154383.getClass(), "tapGood", 1630616830);
        setIntField(term154383, term154383.getClass(), "tapBad", 1334699881);
        setIntField(term154383, term154383.getClass(), "holdPerfect", 992493749);
        setIntField(term154383, term154383.getClass(), "holdGreat", 41248964);
        setIntField(term154383, term154383.getClass(), "holdGood", -1549033130);
        setIntField(term154383, term154383.getClass(), "holdBad", -1755019956);
        setIntField(term154383, term154383.getClass(), "slidePerfect", 364532158);
        setIntField(term154383, term154383.getClass(), "slideGreat", 482828741);
        setIntField(term154383, term154383.getClass(), "slideGood", -1106802731);
        setIntField(term154383, term154383.getClass(), "slideBad", -532485481);
        setIntField(term154383, term154383.getClass(), "breakPerfect", 188077968);
        setIntField(term154383, term154383.getClass(), "breakGreat", -602545418);
        setIntField(term154383, term154383.getClass(), "breakGood", 1002406020);
        setIntField(term154383, term154383.getClass(), "breakBad", 652971611);
        setBooleanField(term154383, term154383.getClass(), "isTrackSkip", true);
        setBooleanField(term154383, term154383.getClass(), "isHighScore", false);
        setBooleanField(term154383, term154383.getClass(), "isChallengeTrack", false);
        setIntField(term154383, term154383.getClass(), "challengeLife", 54644642);
        setIntField(term154383, term154383.getClass(), "challengeRemain", 2016278744);
        setIntField(term154383, term154383.getClass(), "isAllPerfectPlus", -1399475438);
        term154695 = new Integer(130353690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term154695;
        callMethod(klass, "setAchievement", argTypes, term154383, args);
    }

};


