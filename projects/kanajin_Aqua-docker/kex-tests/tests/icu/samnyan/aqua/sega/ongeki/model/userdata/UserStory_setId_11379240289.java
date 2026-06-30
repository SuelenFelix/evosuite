package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserStory_setId_11379240289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161505;
     Object term161776;

    public UserStory_setId_11379240289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161511 = new Long(-7013378340043571457L);
        term161505 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term161507 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term161509 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161530 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161540 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161505, term161505.getClass(), "id", -1373289583745846808L);
        setLongField(term161507, term161507.getClass(), "id", -242380797470678711L);
        setLongField(term161509, term161509.getClass(), "id", -5130681366312086929L);
        setField(term161509, term161509.getClass(), "extId", term161511);
        setField(term161509, term161509.getClass(), "luid", "ipYdeymslj");
        setIntField(term161526, term161526.getClass(), "year", 2019);
        setShortField(term161526, term161526.getClass(), "month", (short) 4);
        setShortField(term161526, term161526.getClass(), "day", (short) 30);
        setField(term161525, term161525.getClass(), "date", term161526);
        setByteField(term161530, term161530.getClass(), "hour", (byte) 11);
        setByteField(term161530, term161530.getClass(), "minute", (byte) 21);
        setByteField(term161530, term161530.getClass(), "second", (byte) 24);
        setIntField(term161530, term161530.getClass(), "nano", 799334249);
        setField(term161525, term161525.getClass(), "time", term161530);
        setField(term161509, term161509.getClass(), "registerTime", term161525);
        setIntField(term161536, term161536.getClass(), "year", 2012);
        setShortField(term161536, term161536.getClass(), "month", (short) 10);
        setShortField(term161536, term161536.getClass(), "day", (short) 18);
        setField(term161535, term161535.getClass(), "date", term161536);
        setByteField(term161540, term161540.getClass(), "hour", (byte) 0);
        setByteField(term161540, term161540.getClass(), "minute", (byte) 2);
        setByteField(term161540, term161540.getClass(), "second", (byte) 34);
        setIntField(term161540, term161540.getClass(), "nano", 773422612);
        setField(term161535, term161535.getClass(), "time", term161540);
        setField(term161509, term161509.getClass(), "accessTime", term161535);
        setField(term161507, term161507.getClass(), "card", term161509);
        setField(term161507, term161507.getClass(), "userName", "QFMCLCOTms");
        setIntField(term161507, term161507.getClass(), "level", 303574393);
        setIntField(term161507, term161507.getClass(), "reincarnationNum", -837749919);
        setLongField(term161507, term161507.getClass(), "exp", -5815010963403726423L);
        setLongField(term161507, term161507.getClass(), "point", -4344355325060611900L);
        setLongField(term161507, term161507.getClass(), "totalPoint", -2783285373103915891L);
        setIntField(term161507, term161507.getClass(), "playCount", -56371414);
        setIntField(term161507, term161507.getClass(), "jewelCount", 1655747400);
        setIntField(term161507, term161507.getClass(), "totalJewelCount", 1345032092);
        setIntField(term161507, term161507.getClass(), "medalCount", 953985132);
        setIntField(term161507, term161507.getClass(), "playerRating", -1177278432);
        setIntField(term161507, term161507.getClass(), "highestRating", -467461131);
        setIntField(term161507, term161507.getClass(), "battlePoint", 1619548087);
        setIntField(term161507, term161507.getClass(), "bestBattlePoint", -661818935);
        setIntField(term161507, term161507.getClass(), "overDamageBattlePoint", 263615284);
        setBooleanField(term161507, term161507.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term161507, term161507.getClass(), "nameplateId", -1940382171);
        setIntField(term161507, term161507.getClass(), "trophyId", 1646141136);
        setIntField(term161507, term161507.getClass(), "cardId", 1608131433);
        setIntField(term161507, term161507.getClass(), "characterId", 97138194);
        setIntField(term161507, term161507.getClass(), "characterVoiceNo", -744642234);
        setIntField(term161507, term161507.getClass(), "tabSetting", -349460490);
        setIntField(term161507, term161507.getClass(), "tabSortSetting", 1945749170);
        setIntField(term161507, term161507.getClass(), "cardCategorySetting", -282883918);
        setIntField(term161507, term161507.getClass(), "cardSortSetting", -1576666542);
        setIntField(term161507, term161507.getClass(), "rivalScoreCategorySetting", 622981013);
        setIntField(term161507, term161507.getClass(), "playedTutorialBit", -2054776518);
        setIntField(term161507, term161507.getClass(), "firstTutorialCancelNum", -2002407733);
        setLongField(term161507, term161507.getClass(), "sumTechHighScore", 5464988889380818357L);
        setLongField(term161507, term161507.getClass(), "sumTechBasicHighScore", -8081186299043869903L);
        setLongField(term161507, term161507.getClass(), "sumTechAdvancedHighScore", 5268809567055520901L);
        setLongField(term161507, term161507.getClass(), "sumTechExpertHighScore", -5908406676382829407L);
        setLongField(term161507, term161507.getClass(), "sumTechMasterHighScore", 6817440310229946932L);
        setLongField(term161507, term161507.getClass(), "sumTechLunaticHighScore", 7016478005878165666L);
        setLongField(term161507, term161507.getClass(), "sumBattleHighScore", -5985110120806433534L);
        setLongField(term161507, term161507.getClass(), "sumBattleBasicHighScore", -3674362961748634415L);
        setLongField(term161507, term161507.getClass(), "sumBattleAdvancedHighScore", 30900343565357110L);
        setLongField(term161507, term161507.getClass(), "sumBattleExpertHighScore", -7435576953442701299L);
        setLongField(term161507, term161507.getClass(), "sumBattleMasterHighScore", 9011364716758687771L);
        setLongField(term161507, term161507.getClass(), "sumBattleLunaticHighScore", -5390664323916679150L);
        setField(term161507, term161507.getClass(), "eventWatchedDate", "jCtiggtCcS");
        setField(term161507, term161507.getClass(), "cmEventWatchedDate", "HTPoLdgdlc");
        setField(term161507, term161507.getClass(), "firstGameId", "gQbWOQsNZq");
        setField(term161507, term161507.getClass(), "firstRomVersion", "gwXrkdkdqW");
        setField(term161507, term161507.getClass(), "firstDataVersion", "ePMStkWVSW");
        setField(term161507, term161507.getClass(), "firstPlayDate", "lYCXiqdVVs");
        setField(term161507, term161507.getClass(), "lastGameId", "AwEMMAveFP");
        setField(term161507, term161507.getClass(), "lastRomVersion", "uILgJuNCYC");
        setField(term161507, term161507.getClass(), "lastDataVersion", "gUkbWFfDwB");
        setField(term161507, term161507.getClass(), "compatibleCmVersion", "kTamONbRjQ");
        setField(term161507, term161507.getClass(), "lastPlayDate", "hGULbvEJOJ");
        setIntField(term161507, term161507.getClass(), "lastPlaceId", 2079703600);
        setField(term161507, term161507.getClass(), "lastPlaceName", "mHRhpRdJAm");
        setIntField(term161507, term161507.getClass(), "lastRegionId", -1747428341);
        setField(term161507, term161507.getClass(), "lastRegionName", "JPPiPXJaoa");
        setIntField(term161507, term161507.getClass(), "lastAllNetId", 1506522067);
        setField(term161507, term161507.getClass(), "lastClientId", "fGLEhwmSAi");
        setIntField(term161507, term161507.getClass(), "lastUsedDeckId", -1563374460);
        setIntField(term161507, term161507.getClass(), "lastPlayMusicLevel", 1292095065);
        setIntField(term161507, term161507.getClass(), "lastEmoneyBrand", 729473915);
        setField(term161505, term161505.getClass(), "user", term161507);
        setIntField(term161505, term161505.getClass(), "storyId", -1969775161);
        setIntField(term161505, term161505.getClass(), "lastChapterId", 2036970097);
        setIntField(term161505, term161505.getClass(), "jewelCount", 412620735);
        setIntField(term161505, term161505.getClass(), "lastPlayMusicId", -1244382496);
        setIntField(term161505, term161505.getClass(), "lastPlayMusicCategory", 328093796);
        setIntField(term161505, term161505.getClass(), "lastPlayMusicLevel", 1144911037);
        term161776 = new Long(2199487095678847563L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term161776;
        callMethod(klass, "setId", argTypes, term161505, args);
    }

};


