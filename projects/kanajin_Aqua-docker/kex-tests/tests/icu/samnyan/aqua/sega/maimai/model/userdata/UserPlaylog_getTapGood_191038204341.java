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

public class UserPlaylog_getTapGood_191038204341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131743;

    public UserPlaylog_getTapGood_191038204341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term131749 = new Long(-4058686252500969842L);
        term131743 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term131745 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term131747 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term131763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131768 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131778 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term131743, term131743.getClass(), "id", -2742794200189356451L);
        setLongField(term131745, term131745.getClass(), "id", 784504767592240462L);
        setLongField(term131747, term131747.getClass(), "id", -2000525962887472969L);
        setField(term131747, term131747.getClass(), "extId", term131749);
        setField(term131747, term131747.getClass(), "luid", "ojFfVocDNH");
        setIntField(term131764, term131764.getClass(), "year", 2020);
        setShortField(term131764, term131764.getClass(), "month", (short) 10);
        setShortField(term131764, term131764.getClass(), "day", (short) 22);
        setField(term131763, term131763.getClass(), "date", term131764);
        setByteField(term131768, term131768.getClass(), "hour", (byte) 22);
        setByteField(term131768, term131768.getClass(), "minute", (byte) 10);
        setByteField(term131768, term131768.getClass(), "second", (byte) 45);
        setIntField(term131768, term131768.getClass(), "nano", 397845140);
        setField(term131763, term131763.getClass(), "time", term131768);
        setField(term131747, term131747.getClass(), "registerTime", term131763);
        setIntField(term131774, term131774.getClass(), "year", 2023);
        setShortField(term131774, term131774.getClass(), "month", (short) 3);
        setShortField(term131774, term131774.getClass(), "day", (short) 11);
        setField(term131773, term131773.getClass(), "date", term131774);
        setByteField(term131778, term131778.getClass(), "hour", (byte) 2);
        setByteField(term131778, term131778.getClass(), "minute", (byte) 18);
        setByteField(term131778, term131778.getClass(), "second", (byte) 39);
        setIntField(term131778, term131778.getClass(), "nano", 701112042);
        setField(term131773, term131773.getClass(), "time", term131778);
        setField(term131747, term131747.getClass(), "accessTime", term131773);
        setField(term131745, term131745.getClass(), "card", term131747);
        setIntField(term131745, term131745.getClass(), "lastDataVersion", 1324579088);
        setField(term131745, term131745.getClass(), "userName", "gqBOEdccip");
        setIntField(term131745, term131745.getClass(), "point", -896063951);
        setIntField(term131745, term131745.getClass(), "totalPoint", -1627319943);
        setIntField(term131745, term131745.getClass(), "iconId", 88183349);
        setIntField(term131745, term131745.getClass(), "nameplateId", -170217683);
        setIntField(term131745, term131745.getClass(), "frameId", -1344453784);
        setIntField(term131745, term131745.getClass(), "trophyId", 871996273);
        setIntField(term131745, term131745.getClass(), "playCount", -1602801244);
        setIntField(term131745, term131745.getClass(), "playVsCount", 1845202050);
        setIntField(term131745, term131745.getClass(), "playSyncCount", -259872076);
        setIntField(term131745, term131745.getClass(), "winCount", 198838341);
        setIntField(term131745, term131745.getClass(), "helpCount", -327992686);
        setIntField(term131745, term131745.getClass(), "comboCount", 274261047);
        setIntField(term131745, term131745.getClass(), "feverCount", 94059237);
        setIntField(term131745, term131745.getClass(), "totalHiScore", 261356472);
        setIntField(term131745, term131745.getClass(), "totalEasyHighScore", -1633964080);
        setIntField(term131745, term131745.getClass(), "totalBasicHighScore", -908460509);
        setIntField(term131745, term131745.getClass(), "totalAdvancedHighScore", 1263655765);
        setIntField(term131745, term131745.getClass(), "totalExpertHighScore", 1819531350);
        setIntField(term131745, term131745.getClass(), "totalMasterHighScore", -1806268976);
        setIntField(term131745, term131745.getClass(), "totalReMasterHighScore", -588625518);
        setIntField(term131745, term131745.getClass(), "totalHighSync", -1322012320);
        setIntField(term131745, term131745.getClass(), "totalEasySync", 354204124);
        setIntField(term131745, term131745.getClass(), "totalBasicSync", -1384573133);
        setIntField(term131745, term131745.getClass(), "totalAdvancedSync", -702875576);
        setIntField(term131745, term131745.getClass(), "totalExpertSync", 1945418003);
        setIntField(term131745, term131745.getClass(), "totalMasterSync", 1499410902);
        setIntField(term131745, term131745.getClass(), "totalReMasterSync", 2137116320);
        setIntField(term131745, term131745.getClass(), "playerRating", 1142212038);
        setIntField(term131745, term131745.getClass(), "highestRating", 1394128162);
        setIntField(term131745, term131745.getClass(), "rankAuthTailId", 1403824778);
        setField(term131745, term131745.getClass(), "eventWatchedDate", "biglNwhOOx");
        setField(term131745, term131745.getClass(), "webLimitDate", "mianqYKlGq");
        setIntField(term131745, term131745.getClass(), "challengeTrackPhase", 2082609623);
        setIntField(term131745, term131745.getClass(), "firstPlayBits", -2092405045);
        setField(term131745, term131745.getClass(), "lastPlayDate", "GmpbCvsoQd");
        setIntField(term131745, term131745.getClass(), "lastPlaceId", 2082908703);
        setField(term131745, term131745.getClass(), "lastPlaceName", "ypYkYRcFQq");
        setIntField(term131745, term131745.getClass(), "lastRegionId", -89943020);
        setField(term131745, term131745.getClass(), "lastRegionName", "lXLLmOVwcF");
        setField(term131745, term131745.getClass(), "lastClientId", "lIrBbPBrDY");
        setField(term131745, term131745.getClass(), "lastCountryCode", "RDqKYQTmEE");
        setIntField(term131745, term131745.getClass(), "eventPoint", 820771333);
        setIntField(term131745, term131745.getClass(), "totalLv", -1481597667);
        setIntField(term131745, term131745.getClass(), "lastLoginBonusDay", -1665378071);
        setIntField(term131745, term131745.getClass(), "lastSurvivalBonusDay", -833699886);
        setIntField(term131745, term131745.getClass(), "loginBonusLv", -296237735);
        setField(term131743, term131743.getClass(), "user", term131745);
        setIntField(term131743, term131743.getClass(), "orderId", -1696576632);
        setLongField(term131743, term131743.getClass(), "sortNumber", 7651884502076816477L);
        setIntField(term131743, term131743.getClass(), "placeId", 1211788385);
        setField(term131743, term131743.getClass(), "placeName", "MrUUMyYAHK");
        setField(term131743, term131743.getClass(), "country", "mltJfFDGWB");
        setIntField(term131743, term131743.getClass(), "regionId", 225742337);
        setField(term131743, term131743.getClass(), "playDate", "jXearfyNpX");
        setField(term131743, term131743.getClass(), "userPlayDate", "BhmFDzFKBZ");
        setIntField(term131743, term131743.getClass(), "musicId", -380899882);
        setIntField(term131743, term131743.getClass(), "level", 2126833191);
        setIntField(term131743, term131743.getClass(), "gameMode", 605638244);
        setIntField(term131743, term131743.getClass(), "rivalNum", -1241984600);
        setIntField(term131743, term131743.getClass(), "track", 630841707);
        setIntField(term131743, term131743.getClass(), "eventId", 1848879841);
        setBooleanField(term131743, term131743.getClass(), "isFreeToPlay", false);
        setIntField(term131743, term131743.getClass(), "playerRating", 1518458868);
        setLongField(term131743, term131743.getClass(), "playedUserId1", -45437711112045954L);
        setField(term131743, term131743.getClass(), "playedUserName1", "LfhJOBaMfN");
        setIntField(term131743, term131743.getClass(), "playedMusicLevel1", 102665908);
        setLongField(term131743, term131743.getClass(), "playedUserId2", -2665418140152906040L);
        setField(term131743, term131743.getClass(), "playedUserName2", "gTpNrKjAOw");
        setIntField(term131743, term131743.getClass(), "playedMusicLevel2", 285235008);
        setLongField(term131743, term131743.getClass(), "playedUserId3", 590621623960257295L);
        setField(term131743, term131743.getClass(), "playedUserName3", "mezvZVqRCp");
        setIntField(term131743, term131743.getClass(), "playedMusicLevel3", -1345450442);
        setIntField(term131743, term131743.getClass(), "achievement", 1422151864);
        setIntField(term131743, term131743.getClass(), "score", -509282716);
        setIntField(term131743, term131743.getClass(), "tapScore", -9134510);
        setIntField(term131743, term131743.getClass(), "holdScore", 1178675259);
        setIntField(term131743, term131743.getClass(), "slideScore", 435909030);
        setIntField(term131743, term131743.getClass(), "breakScore", 663569895);
        setIntField(term131743, term131743.getClass(), "syncRate", -308690623);
        setIntField(term131743, term131743.getClass(), "vsWin", -1499435550);
        setBooleanField(term131743, term131743.getClass(), "isAllPerfect", false);
        setIntField(term131743, term131743.getClass(), "fullCombo", 953179902);
        setIntField(term131743, term131743.getClass(), "maxFever", 1376611138);
        setIntField(term131743, term131743.getClass(), "maxCombo", 1432720232);
        setIntField(term131743, term131743.getClass(), "tapPerfect", -220448129);
        setIntField(term131743, term131743.getClass(), "tapGreat", 1764740473);
        setIntField(term131743, term131743.getClass(), "tapGood", 1947047031);
        setIntField(term131743, term131743.getClass(), "tapBad", 409008942);
        setIntField(term131743, term131743.getClass(), "holdPerfect", -682037881);
        setIntField(term131743, term131743.getClass(), "holdGreat", 319801026);
        setIntField(term131743, term131743.getClass(), "holdGood", -53670685);
        setIntField(term131743, term131743.getClass(), "holdBad", -1141764709);
        setIntField(term131743, term131743.getClass(), "slidePerfect", -1884053350);
        setIntField(term131743, term131743.getClass(), "slideGreat", 1432928549);
        setIntField(term131743, term131743.getClass(), "slideGood", 1831668967);
        setIntField(term131743, term131743.getClass(), "slideBad", 1945358126);
        setIntField(term131743, term131743.getClass(), "breakPerfect", 1544403394);
        setIntField(term131743, term131743.getClass(), "breakGreat", -1417937275);
        setIntField(term131743, term131743.getClass(), "breakGood", 283533258);
        setIntField(term131743, term131743.getClass(), "breakBad", -674714132);
        setBooleanField(term131743, term131743.getClass(), "isTrackSkip", false);
        setBooleanField(term131743, term131743.getClass(), "isHighScore", false);
        setBooleanField(term131743, term131743.getClass(), "isChallengeTrack", false);
        setIntField(term131743, term131743.getClass(), "challengeLife", 369679869);
        setIntField(term131743, term131743.getClass(), "challengeRemain", -1045666157);
        setIntField(term131743, term131743.getClass(), "isAllPerfectPlus", -1294400546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapGood", argTypes, term131743, args);
    }

};


