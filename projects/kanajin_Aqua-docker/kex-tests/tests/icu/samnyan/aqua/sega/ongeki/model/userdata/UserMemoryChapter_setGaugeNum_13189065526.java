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
import java.lang.Integer;

public class UserMemoryChapter_setGaugeNum_13189065526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400679;
     Object term400955;

    public UserMemoryChapter_setGaugeNum_13189065526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term400685 = new Long(-1234885562462779381L);
        term400679 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term400681 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term400683 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term400699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term400700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term400704 = newInstance(Class.forName("java.time.LocalTime"));
        Object term400709 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term400710 = newInstance(Class.forName("java.time.LocalDate"));
        Object term400714 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term400679, term400679.getClass(), "id", -7845045886193673082L);
        setLongField(term400681, term400681.getClass(), "id", -1486916539285204907L);
        setLongField(term400683, term400683.getClass(), "id", -3270549105313342051L);
        setField(term400683, term400683.getClass(), "extId", term400685);
        setField(term400683, term400683.getClass(), "luid", "yXwNPzLxwd");
        setIntField(term400700, term400700.getClass(), "year", 2011);
        setShortField(term400700, term400700.getClass(), "month", (short) 3);
        setShortField(term400700, term400700.getClass(), "day", (short) 17);
        setField(term400699, term400699.getClass(), "date", term400700);
        setByteField(term400704, term400704.getClass(), "hour", (byte) 15);
        setByteField(term400704, term400704.getClass(), "minute", (byte) 54);
        setByteField(term400704, term400704.getClass(), "second", (byte) 51);
        setIntField(term400704, term400704.getClass(), "nano", 28084735);
        setField(term400699, term400699.getClass(), "time", term400704);
        setField(term400683, term400683.getClass(), "registerTime", term400699);
        setIntField(term400710, term400710.getClass(), "year", 2022);
        setShortField(term400710, term400710.getClass(), "month", (short) 1);
        setShortField(term400710, term400710.getClass(), "day", (short) 18);
        setField(term400709, term400709.getClass(), "date", term400710);
        setByteField(term400714, term400714.getClass(), "hour", (byte) 19);
        setByteField(term400714, term400714.getClass(), "minute", (byte) 29);
        setByteField(term400714, term400714.getClass(), "second", (byte) 52);
        setIntField(term400714, term400714.getClass(), "nano", 7863146);
        setField(term400709, term400709.getClass(), "time", term400714);
        setField(term400683, term400683.getClass(), "accessTime", term400709);
        setField(term400681, term400681.getClass(), "card", term400683);
        setField(term400681, term400681.getClass(), "userName", "wTDrSeLFBG");
        setIntField(term400681, term400681.getClass(), "level", -980412973);
        setIntField(term400681, term400681.getClass(), "reincarnationNum", 340296379);
        setLongField(term400681, term400681.getClass(), "exp", -1424783352963832532L);
        setLongField(term400681, term400681.getClass(), "point", 2856057260447665499L);
        setLongField(term400681, term400681.getClass(), "totalPoint", -1670512845191596240L);
        setIntField(term400681, term400681.getClass(), "playCount", -1361045350);
        setIntField(term400681, term400681.getClass(), "jewelCount", -996818142);
        setIntField(term400681, term400681.getClass(), "totalJewelCount", -1163740842);
        setIntField(term400681, term400681.getClass(), "medalCount", -634674732);
        setIntField(term400681, term400681.getClass(), "playerRating", 24421116);
        setIntField(term400681, term400681.getClass(), "highestRating", -514672136);
        setIntField(term400681, term400681.getClass(), "battlePoint", -1225642143);
        setIntField(term400681, term400681.getClass(), "bestBattlePoint", 898178598);
        setIntField(term400681, term400681.getClass(), "overDamageBattlePoint", -2089628395);
        setBooleanField(term400681, term400681.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term400681, term400681.getClass(), "nameplateId", 118933624);
        setIntField(term400681, term400681.getClass(), "trophyId", -101970788);
        setIntField(term400681, term400681.getClass(), "cardId", -596884988);
        setIntField(term400681, term400681.getClass(), "characterId", -1820157078);
        setIntField(term400681, term400681.getClass(), "characterVoiceNo", 1526472300);
        setIntField(term400681, term400681.getClass(), "tabSetting", -1298477037);
        setIntField(term400681, term400681.getClass(), "tabSortSetting", -1474421667);
        setIntField(term400681, term400681.getClass(), "cardCategorySetting", 264776325);
        setIntField(term400681, term400681.getClass(), "cardSortSetting", 2008590903);
        setIntField(term400681, term400681.getClass(), "rivalScoreCategorySetting", 1318526028);
        setIntField(term400681, term400681.getClass(), "playedTutorialBit", -510474690);
        setIntField(term400681, term400681.getClass(), "firstTutorialCancelNum", -1701912532);
        setLongField(term400681, term400681.getClass(), "sumTechHighScore", 2113873483903050708L);
        setLongField(term400681, term400681.getClass(), "sumTechBasicHighScore", 3231122063265109310L);
        setLongField(term400681, term400681.getClass(), "sumTechAdvancedHighScore", -6395819075543256253L);
        setLongField(term400681, term400681.getClass(), "sumTechExpertHighScore", 602378389007009384L);
        setLongField(term400681, term400681.getClass(), "sumTechMasterHighScore", 8795215889386814509L);
        setLongField(term400681, term400681.getClass(), "sumTechLunaticHighScore", 430277502384927919L);
        setLongField(term400681, term400681.getClass(), "sumBattleHighScore", 7423027171807616966L);
        setLongField(term400681, term400681.getClass(), "sumBattleBasicHighScore", 6047481739665997842L);
        setLongField(term400681, term400681.getClass(), "sumBattleAdvancedHighScore", 7491380885779551380L);
        setLongField(term400681, term400681.getClass(), "sumBattleExpertHighScore", -6075003324338438713L);
        setLongField(term400681, term400681.getClass(), "sumBattleMasterHighScore", 434718662053495122L);
        setLongField(term400681, term400681.getClass(), "sumBattleLunaticHighScore", 8536850335249737672L);
        setField(term400681, term400681.getClass(), "eventWatchedDate", "ssepbvbdXU");
        setField(term400681, term400681.getClass(), "cmEventWatchedDate", "VOKdcozBqc");
        setField(term400681, term400681.getClass(), "firstGameId", "SNEPOLqFoK");
        setField(term400681, term400681.getClass(), "firstRomVersion", "qdBqNnhPef");
        setField(term400681, term400681.getClass(), "firstDataVersion", "ndIwfpjkUv");
        setField(term400681, term400681.getClass(), "firstPlayDate", "SCItgzvkQT");
        setField(term400681, term400681.getClass(), "lastGameId", "QbYAGsbpPc");
        setField(term400681, term400681.getClass(), "lastRomVersion", "HNqvvnHxAX");
        setField(term400681, term400681.getClass(), "lastDataVersion", "VQreltHuqa");
        setField(term400681, term400681.getClass(), "compatibleCmVersion", "RRgSGHNVYZ");
        setField(term400681, term400681.getClass(), "lastPlayDate", "bMdtRxpRGI");
        setIntField(term400681, term400681.getClass(), "lastPlaceId", -324615179);
        setField(term400681, term400681.getClass(), "lastPlaceName", "bbQYQOwRtE");
        setIntField(term400681, term400681.getClass(), "lastRegionId", 1470819738);
        setField(term400681, term400681.getClass(), "lastRegionName", "yoLHJSMrPH");
        setIntField(term400681, term400681.getClass(), "lastAllNetId", 807861402);
        setField(term400681, term400681.getClass(), "lastClientId", "XVglZjgNYI");
        setIntField(term400681, term400681.getClass(), "lastUsedDeckId", 1373240278);
        setIntField(term400681, term400681.getClass(), "lastPlayMusicLevel", 185263840);
        setIntField(term400681, term400681.getClass(), "lastEmoneyBrand", 524378547);
        setField(term400679, term400679.getClass(), "user", term400681);
        setIntField(term400679, term400679.getClass(), "chapterId", 1509364301);
        setIntField(term400679, term400679.getClass(), "jewelCount", 1703492186);
        setIntField(term400679, term400679.getClass(), "lastPlayMusicCategory", -1062134539);
        setIntField(term400679, term400679.getClass(), "lastPlayMusicId", -1252858752);
        setIntField(term400679, term400679.getClass(), "lastPlayMusicLevel", -1037795746);
        setBooleanField(term400679, term400679.getClass(), "isDialogWatched", true);
        setBooleanField(term400679, term400679.getClass(), "isStoryWatched", false);
        setBooleanField(term400679, term400679.getClass(), "isBossWatched", true);
        setBooleanField(term400679, term400679.getClass(), "isClear", true);
        setIntField(term400679, term400679.getClass(), "gaugeId", 2004320489);
        setIntField(term400679, term400679.getClass(), "gaugeNum", 1132658902);
        term400955 = new Integer(858183220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term400955;
        callMethod(klass, "setGaugeNum", argTypes, term400679, args);
    }

};


