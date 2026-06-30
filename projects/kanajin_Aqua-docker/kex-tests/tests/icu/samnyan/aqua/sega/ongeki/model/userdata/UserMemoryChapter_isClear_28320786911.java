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

public class UserMemoryChapter_isClear_28320786911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393694;

    public UserMemoryChapter_isClear_28320786911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term393700 = new Long(7429946509853918683L);
        term393694 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term393696 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term393698 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term393714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term393715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term393719 = newInstance(Class.forName("java.time.LocalTime"));
        Object term393724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term393725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term393729 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term393694, term393694.getClass(), "id", -3044152800785769968L);
        setLongField(term393696, term393696.getClass(), "id", 6897351676415382691L);
        setLongField(term393698, term393698.getClass(), "id", 1036915229171996265L);
        setField(term393698, term393698.getClass(), "extId", term393700);
        setField(term393698, term393698.getClass(), "luid", "hyTzUGyVuK");
        setIntField(term393715, term393715.getClass(), "year", 2010);
        setShortField(term393715, term393715.getClass(), "month", (short) 1);
        setShortField(term393715, term393715.getClass(), "day", (short) 3);
        setField(term393714, term393714.getClass(), "date", term393715);
        setByteField(term393719, term393719.getClass(), "hour", (byte) 21);
        setByteField(term393719, term393719.getClass(), "minute", (byte) 22);
        setByteField(term393719, term393719.getClass(), "second", (byte) 34);
        setIntField(term393719, term393719.getClass(), "nano", 761927783);
        setField(term393714, term393714.getClass(), "time", term393719);
        setField(term393698, term393698.getClass(), "registerTime", term393714);
        setIntField(term393725, term393725.getClass(), "year", 2014);
        setShortField(term393725, term393725.getClass(), "month", (short) 8);
        setShortField(term393725, term393725.getClass(), "day", (short) 4);
        setField(term393724, term393724.getClass(), "date", term393725);
        setByteField(term393729, term393729.getClass(), "hour", (byte) 20);
        setByteField(term393729, term393729.getClass(), "minute", (byte) 44);
        setByteField(term393729, term393729.getClass(), "second", (byte) 33);
        setIntField(term393729, term393729.getClass(), "nano", 225183341);
        setField(term393724, term393724.getClass(), "time", term393729);
        setField(term393698, term393698.getClass(), "accessTime", term393724);
        setField(term393696, term393696.getClass(), "card", term393698);
        setField(term393696, term393696.getClass(), "userName", "phIFohUrgt");
        setIntField(term393696, term393696.getClass(), "level", 1451333632);
        setIntField(term393696, term393696.getClass(), "reincarnationNum", 504479985);
        setLongField(term393696, term393696.getClass(), "exp", 7154811240802208944L);
        setLongField(term393696, term393696.getClass(), "point", 186068278428831214L);
        setLongField(term393696, term393696.getClass(), "totalPoint", 4340463983847366212L);
        setIntField(term393696, term393696.getClass(), "playCount", 1936592958);
        setIntField(term393696, term393696.getClass(), "jewelCount", 814477218);
        setIntField(term393696, term393696.getClass(), "totalJewelCount", -1609137441);
        setIntField(term393696, term393696.getClass(), "medalCount", 514583512);
        setIntField(term393696, term393696.getClass(), "playerRating", 751034095);
        setIntField(term393696, term393696.getClass(), "highestRating", -1205602015);
        setIntField(term393696, term393696.getClass(), "battlePoint", -1334995160);
        setIntField(term393696, term393696.getClass(), "bestBattlePoint", 809078092);
        setIntField(term393696, term393696.getClass(), "overDamageBattlePoint", 410346080);
        setBooleanField(term393696, term393696.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term393696, term393696.getClass(), "nameplateId", -1860446575);
        setIntField(term393696, term393696.getClass(), "trophyId", -2125882776);
        setIntField(term393696, term393696.getClass(), "cardId", 42601053);
        setIntField(term393696, term393696.getClass(), "characterId", -1288786441);
        setIntField(term393696, term393696.getClass(), "characterVoiceNo", 1642731628);
        setIntField(term393696, term393696.getClass(), "tabSetting", -1808920949);
        setIntField(term393696, term393696.getClass(), "tabSortSetting", 541252832);
        setIntField(term393696, term393696.getClass(), "cardCategorySetting", 782020978);
        setIntField(term393696, term393696.getClass(), "cardSortSetting", -748970652);
        setIntField(term393696, term393696.getClass(), "rivalScoreCategorySetting", -169069735);
        setIntField(term393696, term393696.getClass(), "playedTutorialBit", -17444695);
        setIntField(term393696, term393696.getClass(), "firstTutorialCancelNum", -908984310);
        setLongField(term393696, term393696.getClass(), "sumTechHighScore", -4400539493082635439L);
        setLongField(term393696, term393696.getClass(), "sumTechBasicHighScore", 6543171266426513980L);
        setLongField(term393696, term393696.getClass(), "sumTechAdvancedHighScore", 6239758129133855015L);
        setLongField(term393696, term393696.getClass(), "sumTechExpertHighScore", -355566870490534558L);
        setLongField(term393696, term393696.getClass(), "sumTechMasterHighScore", -1341085010950034925L);
        setLongField(term393696, term393696.getClass(), "sumTechLunaticHighScore", 616685953376216886L);
        setLongField(term393696, term393696.getClass(), "sumBattleHighScore", -5782280918998415581L);
        setLongField(term393696, term393696.getClass(), "sumBattleBasicHighScore", 4190330462137805041L);
        setLongField(term393696, term393696.getClass(), "sumBattleAdvancedHighScore", 243764973558315129L);
        setLongField(term393696, term393696.getClass(), "sumBattleExpertHighScore", -3816266606097444666L);
        setLongField(term393696, term393696.getClass(), "sumBattleMasterHighScore", -7814459956251530195L);
        setLongField(term393696, term393696.getClass(), "sumBattleLunaticHighScore", 6018074396439131498L);
        setField(term393696, term393696.getClass(), "eventWatchedDate", "iOcaPvMsWZ");
        setField(term393696, term393696.getClass(), "cmEventWatchedDate", "DBMVfnQhMO");
        setField(term393696, term393696.getClass(), "firstGameId", "czRvLHUFMZ");
        setField(term393696, term393696.getClass(), "firstRomVersion", "RVMkXZUUjX");
        setField(term393696, term393696.getClass(), "firstDataVersion", "ePGFOQJUEY");
        setField(term393696, term393696.getClass(), "firstPlayDate", "zRlJEAQdit");
        setField(term393696, term393696.getClass(), "lastGameId", "kpGaQdYtKb");
        setField(term393696, term393696.getClass(), "lastRomVersion", "bjYvUGZtyt");
        setField(term393696, term393696.getClass(), "lastDataVersion", "NrITReWUOI");
        setField(term393696, term393696.getClass(), "compatibleCmVersion", "WgklvSSPZH");
        setField(term393696, term393696.getClass(), "lastPlayDate", "BQYAvqaZvZ");
        setIntField(term393696, term393696.getClass(), "lastPlaceId", -1953057607);
        setField(term393696, term393696.getClass(), "lastPlaceName", "lTnFtkckkY");
        setIntField(term393696, term393696.getClass(), "lastRegionId", 1832918083);
        setField(term393696, term393696.getClass(), "lastRegionName", "KEDAgedboq");
        setIntField(term393696, term393696.getClass(), "lastAllNetId", 37838840);
        setField(term393696, term393696.getClass(), "lastClientId", "QsFbnbFDcp");
        setIntField(term393696, term393696.getClass(), "lastUsedDeckId", 202270165);
        setIntField(term393696, term393696.getClass(), "lastPlayMusicLevel", -176320054);
        setIntField(term393696, term393696.getClass(), "lastEmoneyBrand", -1207771552);
        setField(term393694, term393694.getClass(), "user", term393696);
        setIntField(term393694, term393694.getClass(), "chapterId", -2093620429);
        setIntField(term393694, term393694.getClass(), "jewelCount", -442503317);
        setIntField(term393694, term393694.getClass(), "lastPlayMusicCategory", -1333009169);
        setIntField(term393694, term393694.getClass(), "lastPlayMusicId", -12379471);
        setIntField(term393694, term393694.getClass(), "lastPlayMusicLevel", -1179547691);
        setBooleanField(term393694, term393694.getClass(), "isDialogWatched", true);
        setBooleanField(term393694, term393694.getClass(), "isStoryWatched", false);
        setBooleanField(term393694, term393694.getClass(), "isBossWatched", true);
        setBooleanField(term393694, term393694.getClass(), "isClear", true);
        setIntField(term393694, term393694.getClass(), "gaugeId", -321239092);
        setIntField(term393694, term393694.getClass(), "gaugeNum", 179613061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term393694, args);
    }

};


