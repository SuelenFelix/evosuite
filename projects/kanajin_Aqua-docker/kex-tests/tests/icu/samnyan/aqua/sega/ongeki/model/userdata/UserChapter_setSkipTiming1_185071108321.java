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

public class UserChapter_setSkipTiming1_185071108321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92742;
     Object term93016;

    public UserChapter_setSkipTiming1_185071108321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term92748 = new Long(-1885698929232124806L);
        term92742 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term92744 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term92746 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term92762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92767 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92777 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term92742, term92742.getClass(), "id", -8062307215635891271L);
        setLongField(term92744, term92744.getClass(), "id", 4269096919613934136L);
        setLongField(term92746, term92746.getClass(), "id", -2563244893214775249L);
        setField(term92746, term92746.getClass(), "extId", term92748);
        setField(term92746, term92746.getClass(), "luid", "SCyDnkiMeE");
        setIntField(term92763, term92763.getClass(), "year", 2026);
        setShortField(term92763, term92763.getClass(), "month", (short) 9);
        setShortField(term92763, term92763.getClass(), "day", (short) 22);
        setField(term92762, term92762.getClass(), "date", term92763);
        setByteField(term92767, term92767.getClass(), "hour", (byte) 22);
        setByteField(term92767, term92767.getClass(), "minute", (byte) 25);
        setByteField(term92767, term92767.getClass(), "second", (byte) 25);
        setIntField(term92767, term92767.getClass(), "nano", 526433618);
        setField(term92762, term92762.getClass(), "time", term92767);
        setField(term92746, term92746.getClass(), "registerTime", term92762);
        setIntField(term92773, term92773.getClass(), "year", 2017);
        setShortField(term92773, term92773.getClass(), "month", (short) 8);
        setShortField(term92773, term92773.getClass(), "day", (short) 11);
        setField(term92772, term92772.getClass(), "date", term92773);
        setByteField(term92777, term92777.getClass(), "hour", (byte) 0);
        setByteField(term92777, term92777.getClass(), "minute", (byte) 12);
        setByteField(term92777, term92777.getClass(), "second", (byte) 8);
        setIntField(term92777, term92777.getClass(), "nano", 421599135);
        setField(term92772, term92772.getClass(), "time", term92777);
        setField(term92746, term92746.getClass(), "accessTime", term92772);
        setField(term92744, term92744.getClass(), "card", term92746);
        setField(term92744, term92744.getClass(), "userName", "WtfwBvpVGp");
        setIntField(term92744, term92744.getClass(), "level", 847182213);
        setIntField(term92744, term92744.getClass(), "reincarnationNum", 1757624590);
        setLongField(term92744, term92744.getClass(), "exp", 2634037196192273345L);
        setLongField(term92744, term92744.getClass(), "point", 2205040918557782878L);
        setLongField(term92744, term92744.getClass(), "totalPoint", 8369727850301838022L);
        setIntField(term92744, term92744.getClass(), "playCount", 694012679);
        setIntField(term92744, term92744.getClass(), "jewelCount", -630916471);
        setIntField(term92744, term92744.getClass(), "totalJewelCount", -167574207);
        setIntField(term92744, term92744.getClass(), "medalCount", 1034189504);
        setIntField(term92744, term92744.getClass(), "playerRating", 250123647);
        setIntField(term92744, term92744.getClass(), "highestRating", -1818613479);
        setIntField(term92744, term92744.getClass(), "battlePoint", -93031622);
        setIntField(term92744, term92744.getClass(), "bestBattlePoint", 1909891216);
        setIntField(term92744, term92744.getClass(), "overDamageBattlePoint", -1231417445);
        setBooleanField(term92744, term92744.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term92744, term92744.getClass(), "nameplateId", -1305887225);
        setIntField(term92744, term92744.getClass(), "trophyId", 1861751365);
        setIntField(term92744, term92744.getClass(), "cardId", 1137036889);
        setIntField(term92744, term92744.getClass(), "characterId", 1607912632);
        setIntField(term92744, term92744.getClass(), "characterVoiceNo", -2089396254);
        setIntField(term92744, term92744.getClass(), "tabSetting", 609444561);
        setIntField(term92744, term92744.getClass(), "tabSortSetting", 2102660964);
        setIntField(term92744, term92744.getClass(), "cardCategorySetting", 131358254);
        setIntField(term92744, term92744.getClass(), "cardSortSetting", -1411314076);
        setIntField(term92744, term92744.getClass(), "rivalScoreCategorySetting", -1465382016);
        setIntField(term92744, term92744.getClass(), "playedTutorialBit", 2111238518);
        setIntField(term92744, term92744.getClass(), "firstTutorialCancelNum", -477500403);
        setLongField(term92744, term92744.getClass(), "sumTechHighScore", 1683089019175871123L);
        setLongField(term92744, term92744.getClass(), "sumTechBasicHighScore", -116582168956576769L);
        setLongField(term92744, term92744.getClass(), "sumTechAdvancedHighScore", -3371877100400482630L);
        setLongField(term92744, term92744.getClass(), "sumTechExpertHighScore", 3994546230408844547L);
        setLongField(term92744, term92744.getClass(), "sumTechMasterHighScore", 1481162221525502572L);
        setLongField(term92744, term92744.getClass(), "sumTechLunaticHighScore", 7397544487121976299L);
        setLongField(term92744, term92744.getClass(), "sumBattleHighScore", -1979212149451637717L);
        setLongField(term92744, term92744.getClass(), "sumBattleBasicHighScore", 7118890039290414390L);
        setLongField(term92744, term92744.getClass(), "sumBattleAdvancedHighScore", 3568278118244677868L);
        setLongField(term92744, term92744.getClass(), "sumBattleExpertHighScore", 70851082861556716L);
        setLongField(term92744, term92744.getClass(), "sumBattleMasterHighScore", 1236947774784576213L);
        setLongField(term92744, term92744.getClass(), "sumBattleLunaticHighScore", 331764730754617349L);
        setField(term92744, term92744.getClass(), "eventWatchedDate", "nqNHstnjtW");
        setField(term92744, term92744.getClass(), "cmEventWatchedDate", "xWqIkjeUFn");
        setField(term92744, term92744.getClass(), "firstGameId", "vBcZiZnuXD");
        setField(term92744, term92744.getClass(), "firstRomVersion", "NRKOkpSTQr");
        setField(term92744, term92744.getClass(), "firstDataVersion", "XwevHLOcph");
        setField(term92744, term92744.getClass(), "firstPlayDate", "BwsQOfTpXz");
        setField(term92744, term92744.getClass(), "lastGameId", "ywBwAaqimp");
        setField(term92744, term92744.getClass(), "lastRomVersion", "ksNDLlwYiK");
        setField(term92744, term92744.getClass(), "lastDataVersion", "KNuSMewyWo");
        setField(term92744, term92744.getClass(), "compatibleCmVersion", "OeZpauZbQm");
        setField(term92744, term92744.getClass(), "lastPlayDate", "UjNsLLEXru");
        setIntField(term92744, term92744.getClass(), "lastPlaceId", 425471770);
        setField(term92744, term92744.getClass(), "lastPlaceName", "VNJLpmwKSs");
        setIntField(term92744, term92744.getClass(), "lastRegionId", -2070314247);
        setField(term92744, term92744.getClass(), "lastRegionName", "kOHYxuEOpb");
        setIntField(term92744, term92744.getClass(), "lastAllNetId", -2128262129);
        setField(term92744, term92744.getClass(), "lastClientId", "kyzuYwxwKl");
        setIntField(term92744, term92744.getClass(), "lastUsedDeckId", -1404754679);
        setIntField(term92744, term92744.getClass(), "lastPlayMusicLevel", 995795018);
        setIntField(term92744, term92744.getClass(), "lastEmoneyBrand", 21168892);
        setField(term92742, term92742.getClass(), "user", term92744);
        setIntField(term92742, term92742.getClass(), "chapterId", 1344518129);
        setIntField(term92742, term92742.getClass(), "jewelCount", -1534477902);
        setIntField(term92742, term92742.getClass(), "lastPlayMusicCategory", -1969746416);
        setIntField(term92742, term92742.getClass(), "lastPlayMusicId", -1506731850);
        setIntField(term92742, term92742.getClass(), "lastPlayMusicLevel", 19036895);
        setBooleanField(term92742, term92742.getClass(), "isStoryWatched", true);
        setBooleanField(term92742, term92742.getClass(), "isClear", false);
        setIntField(term92742, term92742.getClass(), "skipTiming1", 848352999);
        setIntField(term92742, term92742.getClass(), "skipTiming2", 1414809033);
        term93016 = new Integer(234055254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term93016;
        callMethod(klass, "setSkipTiming1", argTypes, term92742, args);
    }

};


