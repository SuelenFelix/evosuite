package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserExtend_getExtraFlag_17492194197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145557;

    public UserExtend_getExtraFlag_17492194197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145563 = new Long(-6602460430714339690L);
        Integer term145626 = new Integer(1046957508);
        Integer term145628 = new Integer(-553500478);
        Integer term145630 = new Integer(841910530);
        Integer term145632 = new Integer(-1415371559);
        ArrayList term145624 = new ArrayList();
        ((ArrayList) term145624).add(term145626);
        ((ArrayList) term145624).add(term145628);
        ((ArrayList) term145624).add(term145630);
        ((ArrayList) term145624).add(term145632);
        ArrayList term145636 = new ArrayList();
        Integer term145920 = new Integer(-2083858949);
        Integer term145922 = new Integer(-1878319299);
        Integer term145924 = new Integer(-690862846);
        Integer term145926 = new Integer(805027262);
        Integer term145928 = new Integer(717389178);
        Integer term145930 = new Integer(-1265226052);
        ArrayList term145918 = new ArrayList();
        ((ArrayList) term145918).add(term145920);
        ((ArrayList) term145918).add(term145922);
        ((ArrayList) term145918).add(term145924);
        ((ArrayList) term145918).add(term145926);
        ((ArrayList) term145918).add(term145928);
        ((ArrayList) term145918).add(term145930);
        ArrayList term145934 = new ArrayList();
        term145557 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term145559 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term145561 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term145577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145582 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145592 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term145557, term145557.getClass(), "id", 4172508245451084859L);
        setLongField(term145559, term145559.getClass(), "id", -6796641557522852512L);
        setLongField(term145561, term145561.getClass(), "id", -3413817283601493614L);
        setField(term145561, term145561.getClass(), "extId", term145563);
        setField(term145561, term145561.getClass(), "luid", "ODCEExTkfn");
        setIntField(term145578, term145578.getClass(), "year", 2019);
        setShortField(term145578, term145578.getClass(), "month", (short) 11);
        setShortField(term145578, term145578.getClass(), "day", (short) 22);
        setField(term145577, term145577.getClass(), "date", term145578);
        setByteField(term145582, term145582.getClass(), "hour", (byte) 12);
        setByteField(term145582, term145582.getClass(), "minute", (byte) 32);
        setByteField(term145582, term145582.getClass(), "second", (byte) 48);
        setIntField(term145582, term145582.getClass(), "nano", 850810582);
        setField(term145577, term145577.getClass(), "time", term145582);
        setField(term145561, term145561.getClass(), "registerTime", term145577);
        setIntField(term145588, term145588.getClass(), "year", 2024);
        setShortField(term145588, term145588.getClass(), "month", (short) 11);
        setShortField(term145588, term145588.getClass(), "day", (short) 18);
        setField(term145587, term145587.getClass(), "date", term145588);
        setByteField(term145592, term145592.getClass(), "hour", (byte) 9);
        setByteField(term145592, term145592.getClass(), "minute", (byte) 40);
        setByteField(term145592, term145592.getClass(), "second", (byte) 54);
        setIntField(term145592, term145592.getClass(), "nano", 533273343);
        setField(term145587, term145587.getClass(), "time", term145592);
        setField(term145561, term145561.getClass(), "accessTime", term145587);
        setField(term145559, term145559.getClass(), "card", term145561);
        setField(term145559, term145559.getClass(), "userName", "WGInnBoBXb");
        setIntField(term145559, term145559.getClass(), "isNetMember", -1099676971);
        setIntField(term145559, term145559.getClass(), "iconId", 826860572);
        setIntField(term145559, term145559.getClass(), "plateId", 1080879900);
        setIntField(term145559, term145559.getClass(), "titleId", -35783514);
        setIntField(term145559, term145559.getClass(), "partnerId", -1751212981);
        setIntField(term145559, term145559.getClass(), "frameId", -573316300);
        setIntField(term145559, term145559.getClass(), "selectMapId", 578872264);
        setIntField(term145559, term145559.getClass(), "totalAwake", -278464853);
        setIntField(term145559, term145559.getClass(), "gradeRating", 184087281);
        setIntField(term145559, term145559.getClass(), "musicRating", 467765373);
        setIntField(term145559, term145559.getClass(), "playerRating", 1278171430);
        setIntField(term145559, term145559.getClass(), "highestRating", 513629950);
        setIntField(term145559, term145559.getClass(), "gradeRank", 1877595756);
        setIntField(term145559, term145559.getClass(), "classRank", 1018531116);
        setIntField(term145559, term145559.getClass(), "courseRank", -1243015891);
        setField(term145559, term145559.getClass(), "charaSlot", term145624);
        setField(term145559, term145559.getClass(), "charaLockSlot", term145636);
        setLongField(term145559, term145559.getClass(), "contentBit", 1792171186875938051L);
        setIntField(term145559, term145559.getClass(), "playCount", -691945518);
        setField(term145559, term145559.getClass(), "eventWatchedDate", "zRdVDyYqUh");
        setField(term145559, term145559.getClass(), "lastGameId", "hsHZkWJHpU");
        setField(term145559, term145559.getClass(), "lastRomVersion", "jACNZKsTgs");
        setField(term145559, term145559.getClass(), "lastDataVersion", "gdXejOZMlf");
        setField(term145559, term145559.getClass(), "lastLoginDate", "FfDXECFXSk");
        setField(term145559, term145559.getClass(), "lastPlayDate", "YfMHlokFKp");
        setIntField(term145559, term145559.getClass(), "lastPlayCredit", -322481955);
        setIntField(term145559, term145559.getClass(), "lastPlayMode", 1550329381);
        setIntField(term145559, term145559.getClass(), "lastPlaceId", -69658488);
        setField(term145559, term145559.getClass(), "lastPlaceName", "mvxWIPkluG");
        setIntField(term145559, term145559.getClass(), "lastAllNetId", -949474221);
        setIntField(term145559, term145559.getClass(), "lastRegionId", 954386331);
        setField(term145559, term145559.getClass(), "lastRegionName", "wOkHioNorr");
        setField(term145559, term145559.getClass(), "lastClientId", "UrMOWCrQMH");
        setField(term145559, term145559.getClass(), "lastCountryCode", "WvuyCTtUTF");
        setIntField(term145559, term145559.getClass(), "lastSelectEMoney", -356095843);
        setIntField(term145559, term145559.getClass(), "lastSelectTicket", 1057672294);
        setIntField(term145559, term145559.getClass(), "lastSelectCourse", -101715989);
        setIntField(term145559, term145559.getClass(), "lastCountCourse", 849720099);
        setField(term145559, term145559.getClass(), "firstGameId", "mSDLNUwhJE");
        setField(term145559, term145559.getClass(), "firstRomVersion", "kydwcBIblz");
        setField(term145559, term145559.getClass(), "firstDataVersion", "uALaoojxvW");
        setField(term145559, term145559.getClass(), "firstPlayDate", "FrsBgmvjej");
        setField(term145559, term145559.getClass(), "compatibleCmVersion", "OmLoZDdbMy");
        setField(term145559, term145559.getClass(), "dailyBonusDate", "mbNJbZsitQ");
        setField(term145559, term145559.getClass(), "dailyCourseBonusDate", "VMuWmeVPqW");
        setField(term145559, term145559.getClass(), "lastPairLoginDate", "wtmpUxaoro");
        setField(term145559, term145559.getClass(), "lastTrialPlayDate", "lZpqCAUiaE");
        setIntField(term145559, term145559.getClass(), "playVsCount", -1883122431);
        setIntField(term145559, term145559.getClass(), "playSyncCount", 1642134926);
        setIntField(term145559, term145559.getClass(), "winCount", 1144024512);
        setIntField(term145559, term145559.getClass(), "helpCount", -1985125812);
        setIntField(term145559, term145559.getClass(), "comboCount", -1768739818);
        setLongField(term145559, term145559.getClass(), "totalDeluxscore", -7572992706433807080L);
        setLongField(term145559, term145559.getClass(), "totalBasicDeluxscore", 6381717981848057414L);
        setLongField(term145559, term145559.getClass(), "totalAdvancedDeluxscore", -7918934546275014386L);
        setLongField(term145559, term145559.getClass(), "totalExpertDeluxscore", 6059741189973328435L);
        setLongField(term145559, term145559.getClass(), "totalMasterDeluxscore", 4511856667622318751L);
        setLongField(term145559, term145559.getClass(), "totalReMasterDeluxscore", 8217387676864929174L);
        setIntField(term145559, term145559.getClass(), "totalSync", -1499925323);
        setIntField(term145559, term145559.getClass(), "totalBasicSync", -745147263);
        setIntField(term145559, term145559.getClass(), "totalAdvancedSync", 285424830);
        setIntField(term145559, term145559.getClass(), "totalExpertSync", 1448276576);
        setIntField(term145559, term145559.getClass(), "totalMasterSync", 376848403);
        setIntField(term145559, term145559.getClass(), "totalReMasterSync", -1638823326);
        setLongField(term145559, term145559.getClass(), "totalAchievement", -2400126170395987933L);
        setLongField(term145559, term145559.getClass(), "totalBasicAchievement", -323444339356337436L);
        setLongField(term145559, term145559.getClass(), "totalAdvancedAchievement", -1516856062016520287L);
        setLongField(term145559, term145559.getClass(), "totalExpertAchievement", -6572885025393605032L);
        setLongField(term145559, term145559.getClass(), "totalMasterAchievement", 1545876578766248342L);
        setLongField(term145559, term145559.getClass(), "totalReMasterAchievement", -220718414597615522L);
        setLongField(term145559, term145559.getClass(), "playerOldRating", 5177517643223018484L);
        setLongField(term145559, term145559.getClass(), "playerNewRating", -3934057876521797067L);
        setIntField(term145559, term145559.getClass(), "banState", 1836202148);
        setLongField(term145559, term145559.getClass(), "dateTime", 6659925498290372973L);
        setField(term145557, term145557.getClass(), "user", term145559);
        setIntField(term145557, term145557.getClass(), "selectMusicId", -838056504);
        setIntField(term145557, term145557.getClass(), "selectDifficultyId", 216597043);
        setIntField(term145557, term145557.getClass(), "categoryIndex", -1863649948);
        setIntField(term145557, term145557.getClass(), "musicIndex", 1188132768);
        setIntField(term145557, term145557.getClass(), "extraFlag", -210441864);
        setIntField(term145557, term145557.getClass(), "selectScoreType", -993404406);
        setLongField(term145557, term145557.getClass(), "extendContentBit", 2250315847064733903L);
        setBooleanField(term145557, term145557.getClass(), "isPhotoAgree", false);
        setBooleanField(term145557, term145557.getClass(), "isGotoCodeRead", true);
        setBooleanField(term145557, term145557.getClass(), "selectResultDetails", true);
        setIntField(term145557, term145557.getClass(), "sortCategorySetting", -843807783);
        setIntField(term145557, term145557.getClass(), "sortMusicSetting", -1540931841);
        setField(term145557, term145557.getClass(), "selectedCardList", term145918);
        setField(term145557, term145557.getClass(), "encountMapNpcList", term145934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraFlag", argTypes, term145557, args);
    }

};


