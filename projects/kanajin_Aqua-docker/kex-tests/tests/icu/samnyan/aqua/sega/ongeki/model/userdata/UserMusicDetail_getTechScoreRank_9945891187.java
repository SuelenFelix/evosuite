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

public class UserMusicDetail_getTechScoreRank_9945891187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406817;

    public UserMusicDetail_getTechScoreRank_9945891187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term406823 = new Long(-8901826621860118061L);
        term406817 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term406819 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term406821 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term406837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term406838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term406842 = newInstance(Class.forName("java.time.LocalTime"));
        Object term406847 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term406848 = newInstance(Class.forName("java.time.LocalDate"));
        Object term406852 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term406817, term406817.getClass(), "id", 9052837432546483731L);
        setLongField(term406819, term406819.getClass(), "id", 720893526583298286L);
        setLongField(term406821, term406821.getClass(), "id", -7231097584212090931L);
        setField(term406821, term406821.getClass(), "extId", term406823);
        setField(term406821, term406821.getClass(), "luid", "AdNhxoENfe");
        setIntField(term406838, term406838.getClass(), "year", 2019);
        setShortField(term406838, term406838.getClass(), "month", (short) 9);
        setShortField(term406838, term406838.getClass(), "day", (short) 8);
        setField(term406837, term406837.getClass(), "date", term406838);
        setByteField(term406842, term406842.getClass(), "hour", (byte) 22);
        setByteField(term406842, term406842.getClass(), "minute", (byte) 56);
        setByteField(term406842, term406842.getClass(), "second", (byte) 8);
        setIntField(term406842, term406842.getClass(), "nano", 479364056);
        setField(term406837, term406837.getClass(), "time", term406842);
        setField(term406821, term406821.getClass(), "registerTime", term406837);
        setIntField(term406848, term406848.getClass(), "year", 2019);
        setShortField(term406848, term406848.getClass(), "month", (short) 3);
        setShortField(term406848, term406848.getClass(), "day", (short) 23);
        setField(term406847, term406847.getClass(), "date", term406848);
        setByteField(term406852, term406852.getClass(), "hour", (byte) 23);
        setByteField(term406852, term406852.getClass(), "minute", (byte) 49);
        setByteField(term406852, term406852.getClass(), "second", (byte) 56);
        setIntField(term406852, term406852.getClass(), "nano", 82527744);
        setField(term406847, term406847.getClass(), "time", term406852);
        setField(term406821, term406821.getClass(), "accessTime", term406847);
        setField(term406819, term406819.getClass(), "card", term406821);
        setField(term406819, term406819.getClass(), "userName", "oiWzPPucYk");
        setIntField(term406819, term406819.getClass(), "level", 491006204);
        setIntField(term406819, term406819.getClass(), "reincarnationNum", -1668468860);
        setLongField(term406819, term406819.getClass(), "exp", -2451137721126559250L);
        setLongField(term406819, term406819.getClass(), "point", -7142079422361265774L);
        setLongField(term406819, term406819.getClass(), "totalPoint", 4204446600829498873L);
        setIntField(term406819, term406819.getClass(), "playCount", 1091235013);
        setIntField(term406819, term406819.getClass(), "jewelCount", 1013726711);
        setIntField(term406819, term406819.getClass(), "totalJewelCount", -689650037);
        setIntField(term406819, term406819.getClass(), "medalCount", 879594868);
        setIntField(term406819, term406819.getClass(), "playerRating", -1798242383);
        setIntField(term406819, term406819.getClass(), "highestRating", 724146173);
        setIntField(term406819, term406819.getClass(), "battlePoint", -229522915);
        setIntField(term406819, term406819.getClass(), "bestBattlePoint", -320475908);
        setIntField(term406819, term406819.getClass(), "overDamageBattlePoint", 1533539679);
        setBooleanField(term406819, term406819.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term406819, term406819.getClass(), "nameplateId", 1537304565);
        setIntField(term406819, term406819.getClass(), "trophyId", -1875881645);
        setIntField(term406819, term406819.getClass(), "cardId", -495604003);
        setIntField(term406819, term406819.getClass(), "characterId", 882284123);
        setIntField(term406819, term406819.getClass(), "characterVoiceNo", 740252538);
        setIntField(term406819, term406819.getClass(), "tabSetting", 796241512);
        setIntField(term406819, term406819.getClass(), "tabSortSetting", 1584440688);
        setIntField(term406819, term406819.getClass(), "cardCategorySetting", 1918607200);
        setIntField(term406819, term406819.getClass(), "cardSortSetting", -1185300755);
        setIntField(term406819, term406819.getClass(), "rivalScoreCategorySetting", -108265815);
        setIntField(term406819, term406819.getClass(), "playedTutorialBit", 1957784591);
        setIntField(term406819, term406819.getClass(), "firstTutorialCancelNum", -1064251673);
        setLongField(term406819, term406819.getClass(), "sumTechHighScore", 7261930415384168406L);
        setLongField(term406819, term406819.getClass(), "sumTechBasicHighScore", 284407895381973861L);
        setLongField(term406819, term406819.getClass(), "sumTechAdvancedHighScore", 5812631139346531212L);
        setLongField(term406819, term406819.getClass(), "sumTechExpertHighScore", 630357306867194790L);
        setLongField(term406819, term406819.getClass(), "sumTechMasterHighScore", 4853024974865293806L);
        setLongField(term406819, term406819.getClass(), "sumTechLunaticHighScore", 4963556831644279467L);
        setLongField(term406819, term406819.getClass(), "sumBattleHighScore", 6827756407148809342L);
        setLongField(term406819, term406819.getClass(), "sumBattleBasicHighScore", -6279272390622510968L);
        setLongField(term406819, term406819.getClass(), "sumBattleAdvancedHighScore", -7083639040362932921L);
        setLongField(term406819, term406819.getClass(), "sumBattleExpertHighScore", -945372690225290924L);
        setLongField(term406819, term406819.getClass(), "sumBattleMasterHighScore", 3627823862949907304L);
        setLongField(term406819, term406819.getClass(), "sumBattleLunaticHighScore", -4318897785943810220L);
        setField(term406819, term406819.getClass(), "eventWatchedDate", "YKQNqVfCbx");
        setField(term406819, term406819.getClass(), "cmEventWatchedDate", "KXfoKzPweB");
        setField(term406819, term406819.getClass(), "firstGameId", "OolXhuTrRv");
        setField(term406819, term406819.getClass(), "firstRomVersion", "wFuLQiXZWe");
        setField(term406819, term406819.getClass(), "firstDataVersion", "diKZRmRkrz");
        setField(term406819, term406819.getClass(), "firstPlayDate", "FclqywZOtH");
        setField(term406819, term406819.getClass(), "lastGameId", "LUcaXtXMge");
        setField(term406819, term406819.getClass(), "lastRomVersion", "yUCNLMVGuf");
        setField(term406819, term406819.getClass(), "lastDataVersion", "rdxaPgOoke");
        setField(term406819, term406819.getClass(), "compatibleCmVersion", "GXSywkDVVC");
        setField(term406819, term406819.getClass(), "lastPlayDate", "DqjUmvclsm");
        setIntField(term406819, term406819.getClass(), "lastPlaceId", -1719583368);
        setField(term406819, term406819.getClass(), "lastPlaceName", "OwDspCYHCz");
        setIntField(term406819, term406819.getClass(), "lastRegionId", 171617316);
        setField(term406819, term406819.getClass(), "lastRegionName", "IWgPNZNxeW");
        setIntField(term406819, term406819.getClass(), "lastAllNetId", 739201203);
        setField(term406819, term406819.getClass(), "lastClientId", "BpvHOkDswc");
        setIntField(term406819, term406819.getClass(), "lastUsedDeckId", -365381632);
        setIntField(term406819, term406819.getClass(), "lastPlayMusicLevel", -46260912);
        setIntField(term406819, term406819.getClass(), "lastEmoneyBrand", -2041698657);
        setField(term406817, term406817.getClass(), "user", term406819);
        setIntField(term406817, term406817.getClass(), "musicId", 1410773982);
        setIntField(term406817, term406817.getClass(), "level", -1655280027);
        setIntField(term406817, term406817.getClass(), "playCount", -779191239);
        setIntField(term406817, term406817.getClass(), "techScoreMax", -213499956);
        setIntField(term406817, term406817.getClass(), "techScoreRank", -1727200581);
        setIntField(term406817, term406817.getClass(), "battleScoreMax", 1418420172);
        setIntField(term406817, term406817.getClass(), "battleScoreRank", 984436815);
        setIntField(term406817, term406817.getClass(), "maxComboCount", -1022257479);
        setIntField(term406817, term406817.getClass(), "maxOverKill", 204976003);
        setIntField(term406817, term406817.getClass(), "maxTeamOverKill", -727126403);
        setBooleanField(term406817, term406817.getClass(), "isFullBell", true);
        setBooleanField(term406817, term406817.getClass(), "isFullCombo", false);
        setBooleanField(term406817, term406817.getClass(), "isAllBreake", true);
        setBooleanField(term406817, term406817.getClass(), "isLock", false);
        setIntField(term406817, term406817.getClass(), "clearStatus", -1268633342);
        setBooleanField(term406817, term406817.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechScoreRank", argTypes, term406817, args);
    }

};


