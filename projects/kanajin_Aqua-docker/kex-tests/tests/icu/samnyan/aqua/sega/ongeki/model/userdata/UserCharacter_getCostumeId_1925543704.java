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

public class UserCharacter_getCostumeId_1925543704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169529;

    public UserCharacter_getCostumeId_1925543704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169535 = new Long(-7005300544167632229L);
        term169529 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term169531 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term169533 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term169549 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169550 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169554 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169564 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169529, term169529.getClass(), "id", 5802126062780266371L);
        setLongField(term169531, term169531.getClass(), "id", 8916610383825200327L);
        setLongField(term169533, term169533.getClass(), "id", -3797656198625801846L);
        setField(term169533, term169533.getClass(), "extId", term169535);
        setField(term169533, term169533.getClass(), "luid", "NFNQQRlzoy");
        setIntField(term169550, term169550.getClass(), "year", 2016);
        setShortField(term169550, term169550.getClass(), "month", (short) 10);
        setShortField(term169550, term169550.getClass(), "day", (short) 4);
        setField(term169549, term169549.getClass(), "date", term169550);
        setByteField(term169554, term169554.getClass(), "hour", (byte) 21);
        setByteField(term169554, term169554.getClass(), "minute", (byte) 48);
        setByteField(term169554, term169554.getClass(), "second", (byte) 47);
        setIntField(term169554, term169554.getClass(), "nano", 98983875);
        setField(term169549, term169549.getClass(), "time", term169554);
        setField(term169533, term169533.getClass(), "registerTime", term169549);
        setIntField(term169560, term169560.getClass(), "year", 2027);
        setShortField(term169560, term169560.getClass(), "month", (short) 1);
        setShortField(term169560, term169560.getClass(), "day", (short) 18);
        setField(term169559, term169559.getClass(), "date", term169560);
        setByteField(term169564, term169564.getClass(), "hour", (byte) 14);
        setByteField(term169564, term169564.getClass(), "minute", (byte) 46);
        setByteField(term169564, term169564.getClass(), "second", (byte) 5);
        setIntField(term169564, term169564.getClass(), "nano", 748048450);
        setField(term169559, term169559.getClass(), "time", term169564);
        setField(term169533, term169533.getClass(), "accessTime", term169559);
        setField(term169531, term169531.getClass(), "card", term169533);
        setField(term169531, term169531.getClass(), "userName", "IeKvLueLAJ");
        setIntField(term169531, term169531.getClass(), "level", 394662686);
        setIntField(term169531, term169531.getClass(), "reincarnationNum", -910791861);
        setLongField(term169531, term169531.getClass(), "exp", 2193982667821200359L);
        setLongField(term169531, term169531.getClass(), "point", -4225168292049445660L);
        setLongField(term169531, term169531.getClass(), "totalPoint", 6662557842491889405L);
        setIntField(term169531, term169531.getClass(), "playCount", -178690612);
        setIntField(term169531, term169531.getClass(), "jewelCount", -1794156731);
        setIntField(term169531, term169531.getClass(), "totalJewelCount", 1642371312);
        setIntField(term169531, term169531.getClass(), "medalCount", 1331115116);
        setIntField(term169531, term169531.getClass(), "playerRating", 744237210);
        setIntField(term169531, term169531.getClass(), "highestRating", 1971480321);
        setIntField(term169531, term169531.getClass(), "battlePoint", 1363084633);
        setIntField(term169531, term169531.getClass(), "bestBattlePoint", -692367029);
        setIntField(term169531, term169531.getClass(), "overDamageBattlePoint", 1212696537);
        setBooleanField(term169531, term169531.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term169531, term169531.getClass(), "nameplateId", 1781872751);
        setIntField(term169531, term169531.getClass(), "trophyId", -1949151824);
        setIntField(term169531, term169531.getClass(), "cardId", 120099411);
        setIntField(term169531, term169531.getClass(), "characterId", -1103544663);
        setIntField(term169531, term169531.getClass(), "characterVoiceNo", 113634266);
        setIntField(term169531, term169531.getClass(), "tabSetting", 510970949);
        setIntField(term169531, term169531.getClass(), "tabSortSetting", 1646304251);
        setIntField(term169531, term169531.getClass(), "cardCategorySetting", -385959598);
        setIntField(term169531, term169531.getClass(), "cardSortSetting", -1919082628);
        setIntField(term169531, term169531.getClass(), "rivalScoreCategorySetting", 1097362886);
        setIntField(term169531, term169531.getClass(), "playedTutorialBit", 1976963675);
        setIntField(term169531, term169531.getClass(), "firstTutorialCancelNum", 1318525762);
        setLongField(term169531, term169531.getClass(), "sumTechHighScore", -5802097793900081339L);
        setLongField(term169531, term169531.getClass(), "sumTechBasicHighScore", -4896356265370003983L);
        setLongField(term169531, term169531.getClass(), "sumTechAdvancedHighScore", -8079990214114446951L);
        setLongField(term169531, term169531.getClass(), "sumTechExpertHighScore", -9121863504856704916L);
        setLongField(term169531, term169531.getClass(), "sumTechMasterHighScore", -4459179453474120410L);
        setLongField(term169531, term169531.getClass(), "sumTechLunaticHighScore", 2755379365736921497L);
        setLongField(term169531, term169531.getClass(), "sumBattleHighScore", -2208763219528665359L);
        setLongField(term169531, term169531.getClass(), "sumBattleBasicHighScore", -8331765952428714962L);
        setLongField(term169531, term169531.getClass(), "sumBattleAdvancedHighScore", -8419887083771361951L);
        setLongField(term169531, term169531.getClass(), "sumBattleExpertHighScore", 382074525446048429L);
        setLongField(term169531, term169531.getClass(), "sumBattleMasterHighScore", 4945879608228215842L);
        setLongField(term169531, term169531.getClass(), "sumBattleLunaticHighScore", 3687726401872154598L);
        setField(term169531, term169531.getClass(), "eventWatchedDate", "ieojZMRfIP");
        setField(term169531, term169531.getClass(), "cmEventWatchedDate", "xGdfhUYQmU");
        setField(term169531, term169531.getClass(), "firstGameId", "PWmzhOfNzV");
        setField(term169531, term169531.getClass(), "firstRomVersion", "ZeTCBMLdWW");
        setField(term169531, term169531.getClass(), "firstDataVersion", "bffGvWgxLN");
        setField(term169531, term169531.getClass(), "firstPlayDate", "TvYKjqAoNz");
        setField(term169531, term169531.getClass(), "lastGameId", "zPRseSodwc");
        setField(term169531, term169531.getClass(), "lastRomVersion", "kaAoZDhQvv");
        setField(term169531, term169531.getClass(), "lastDataVersion", "yKFwbIOjQp");
        setField(term169531, term169531.getClass(), "compatibleCmVersion", "DgxpRIGTJP");
        setField(term169531, term169531.getClass(), "lastPlayDate", "ivdqsLhJhX");
        setIntField(term169531, term169531.getClass(), "lastPlaceId", -1657759952);
        setField(term169531, term169531.getClass(), "lastPlaceName", "QPBMeaIigj");
        setIntField(term169531, term169531.getClass(), "lastRegionId", -1302867740);
        setField(term169531, term169531.getClass(), "lastRegionName", "BGSrfrYURh");
        setIntField(term169531, term169531.getClass(), "lastAllNetId", -74421758);
        setField(term169531, term169531.getClass(), "lastClientId", "HzAskiKTsr");
        setIntField(term169531, term169531.getClass(), "lastUsedDeckId", -1715609258);
        setIntField(term169531, term169531.getClass(), "lastPlayMusicLevel", -325309589);
        setIntField(term169531, term169531.getClass(), "lastEmoneyBrand", 1225997367);
        setField(term169529, term169529.getClass(), "user", term169531);
        setIntField(term169529, term169529.getClass(), "characterId", 1463513606);
        setIntField(term169529, term169529.getClass(), "costumeId", -2105056168);
        setIntField(term169529, term169529.getClass(), "attachmentId", 275133293);
        setIntField(term169529, term169529.getClass(), "playCount", 915181151);
        setIntField(term169529, term169529.getClass(), "intimateLevel", 1537010523);
        setIntField(term169529, term169529.getClass(), "intimateCount", -661143608);
        setIntField(term169529, term169529.getClass(), "intimateCountRewarded", -605823310);
        setField(term169529, term169529.getClass(), "intimateCountDate", "KsjHvhvzcS");
        setBooleanField(term169529, term169529.getClass(), "isNew", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCostumeId", argTypes, term169529, args);
    }

};


