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

public class UserCharacter_isNew_183188254111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172714;

    public UserCharacter_isNew_183188254111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term172720 = new Long(-1571034605670661708L);
        term172714 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term172716 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term172718 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term172734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term172744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term172745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term172749 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term172714, term172714.getClass(), "id", 1629913363654370546L);
        setLongField(term172716, term172716.getClass(), "id", -7475670834842534934L);
        setLongField(term172718, term172718.getClass(), "id", -5992307503492495034L);
        setField(term172718, term172718.getClass(), "extId", term172720);
        setField(term172718, term172718.getClass(), "luid", "SgKKHyCXge");
        setIntField(term172735, term172735.getClass(), "year", 2015);
        setShortField(term172735, term172735.getClass(), "month", (short) 3);
        setShortField(term172735, term172735.getClass(), "day", (short) 31);
        setField(term172734, term172734.getClass(), "date", term172735);
        setByteField(term172739, term172739.getClass(), "hour", (byte) 9);
        setByteField(term172739, term172739.getClass(), "minute", (byte) 42);
        setByteField(term172739, term172739.getClass(), "second", (byte) 3);
        setIntField(term172739, term172739.getClass(), "nano", 508678403);
        setField(term172734, term172734.getClass(), "time", term172739);
        setField(term172718, term172718.getClass(), "registerTime", term172734);
        setIntField(term172745, term172745.getClass(), "year", 2020);
        setShortField(term172745, term172745.getClass(), "month", (short) 9);
        setShortField(term172745, term172745.getClass(), "day", (short) 13);
        setField(term172744, term172744.getClass(), "date", term172745);
        setByteField(term172749, term172749.getClass(), "hour", (byte) 0);
        setByteField(term172749, term172749.getClass(), "minute", (byte) 7);
        setByteField(term172749, term172749.getClass(), "second", (byte) 27);
        setIntField(term172749, term172749.getClass(), "nano", 835567947);
        setField(term172744, term172744.getClass(), "time", term172749);
        setField(term172718, term172718.getClass(), "accessTime", term172744);
        setField(term172716, term172716.getClass(), "card", term172718);
        setField(term172716, term172716.getClass(), "userName", "QQiXRYFyfp");
        setIntField(term172716, term172716.getClass(), "level", 9224215);
        setIntField(term172716, term172716.getClass(), "reincarnationNum", -670714346);
        setLongField(term172716, term172716.getClass(), "exp", -8627807026781394638L);
        setLongField(term172716, term172716.getClass(), "point", -8237795903098574568L);
        setLongField(term172716, term172716.getClass(), "totalPoint", 4442762297096294204L);
        setIntField(term172716, term172716.getClass(), "playCount", 1047072744);
        setIntField(term172716, term172716.getClass(), "jewelCount", -360839548);
        setIntField(term172716, term172716.getClass(), "totalJewelCount", -1920369405);
        setIntField(term172716, term172716.getClass(), "medalCount", 1275481671);
        setIntField(term172716, term172716.getClass(), "playerRating", -579526757);
        setIntField(term172716, term172716.getClass(), "highestRating", 1833184694);
        setIntField(term172716, term172716.getClass(), "battlePoint", 743393064);
        setIntField(term172716, term172716.getClass(), "bestBattlePoint", -1134463597);
        setIntField(term172716, term172716.getClass(), "overDamageBattlePoint", 1984180612);
        setBooleanField(term172716, term172716.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term172716, term172716.getClass(), "nameplateId", 1176733985);
        setIntField(term172716, term172716.getClass(), "trophyId", -1966919914);
        setIntField(term172716, term172716.getClass(), "cardId", 153319034);
        setIntField(term172716, term172716.getClass(), "characterId", 60632310);
        setIntField(term172716, term172716.getClass(), "characterVoiceNo", -630247452);
        setIntField(term172716, term172716.getClass(), "tabSetting", 1613548595);
        setIntField(term172716, term172716.getClass(), "tabSortSetting", -277642697);
        setIntField(term172716, term172716.getClass(), "cardCategorySetting", 1749853603);
        setIntField(term172716, term172716.getClass(), "cardSortSetting", 318642073);
        setIntField(term172716, term172716.getClass(), "rivalScoreCategorySetting", 402336735);
        setIntField(term172716, term172716.getClass(), "playedTutorialBit", 1534581521);
        setIntField(term172716, term172716.getClass(), "firstTutorialCancelNum", 683825505);
        setLongField(term172716, term172716.getClass(), "sumTechHighScore", 6038479498425106910L);
        setLongField(term172716, term172716.getClass(), "sumTechBasicHighScore", -1430997230026136507L);
        setLongField(term172716, term172716.getClass(), "sumTechAdvancedHighScore", -7698255142334748068L);
        setLongField(term172716, term172716.getClass(), "sumTechExpertHighScore", -3113967336998881340L);
        setLongField(term172716, term172716.getClass(), "sumTechMasterHighScore", -6726339959134278258L);
        setLongField(term172716, term172716.getClass(), "sumTechLunaticHighScore", -3539068786560687629L);
        setLongField(term172716, term172716.getClass(), "sumBattleHighScore", -4948801887280762934L);
        setLongField(term172716, term172716.getClass(), "sumBattleBasicHighScore", -8337123816733562994L);
        setLongField(term172716, term172716.getClass(), "sumBattleAdvancedHighScore", -8921672016906534362L);
        setLongField(term172716, term172716.getClass(), "sumBattleExpertHighScore", 1234590873555457498L);
        setLongField(term172716, term172716.getClass(), "sumBattleMasterHighScore", -5594266310801831914L);
        setLongField(term172716, term172716.getClass(), "sumBattleLunaticHighScore", -8038991382672778520L);
        setField(term172716, term172716.getClass(), "eventWatchedDate", "AZKGDfKUUm");
        setField(term172716, term172716.getClass(), "cmEventWatchedDate", "ZDEPwmbfhY");
        setField(term172716, term172716.getClass(), "firstGameId", "WYVrNaDrUc");
        setField(term172716, term172716.getClass(), "firstRomVersion", "mVomHqNgrb");
        setField(term172716, term172716.getClass(), "firstDataVersion", "OLziNMZeIz");
        setField(term172716, term172716.getClass(), "firstPlayDate", "ZtxRaargvH");
        setField(term172716, term172716.getClass(), "lastGameId", "KllSVUGQSW");
        setField(term172716, term172716.getClass(), "lastRomVersion", "ITqIOsXfUJ");
        setField(term172716, term172716.getClass(), "lastDataVersion", "cgVlVAtNlm");
        setField(term172716, term172716.getClass(), "compatibleCmVersion", "ZgJCdjqDAL");
        setField(term172716, term172716.getClass(), "lastPlayDate", "qpbSvvkYtX");
        setIntField(term172716, term172716.getClass(), "lastPlaceId", -874006328);
        setField(term172716, term172716.getClass(), "lastPlaceName", "hqDAOUCzIF");
        setIntField(term172716, term172716.getClass(), "lastRegionId", 331812569);
        setField(term172716, term172716.getClass(), "lastRegionName", "GPYpSLUunt");
        setIntField(term172716, term172716.getClass(), "lastAllNetId", -694038544);
        setField(term172716, term172716.getClass(), "lastClientId", "JwUkPqRLxz");
        setIntField(term172716, term172716.getClass(), "lastUsedDeckId", -371046864);
        setIntField(term172716, term172716.getClass(), "lastPlayMusicLevel", 1895958176);
        setIntField(term172716, term172716.getClass(), "lastEmoneyBrand", -344909600);
        setField(term172714, term172714.getClass(), "user", term172716);
        setIntField(term172714, term172714.getClass(), "characterId", 377838898);
        setIntField(term172714, term172714.getClass(), "costumeId", 415407227);
        setIntField(term172714, term172714.getClass(), "attachmentId", 1612361187);
        setIntField(term172714, term172714.getClass(), "playCount", 1325455005);
        setIntField(term172714, term172714.getClass(), "intimateLevel", -1370913089);
        setIntField(term172714, term172714.getClass(), "intimateCount", -891285090);
        setIntField(term172714, term172714.getClass(), "intimateCountRewarded", -351219934);
        setField(term172714, term172714.getClass(), "intimateCountDate", "iNBLECkovg");
        setBooleanField(term172714, term172714.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNew", argTypes, term172714, args);
    }

};


