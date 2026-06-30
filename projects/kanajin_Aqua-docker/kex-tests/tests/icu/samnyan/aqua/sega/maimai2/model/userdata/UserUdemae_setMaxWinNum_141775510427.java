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

public class UserUdemae_setMaxWinNum_141775510427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110721;
     Object term111100;

    public UserUdemae_setMaxWinNum_141775510427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term110727 = new Long(-6100012593724108983L);
        Integer term110790 = new Integer(1268893136);
        Integer term110792 = new Integer(-1472700822);
        Integer term110794 = new Integer(1626670889);
        Integer term110796 = new Integer(-2117361140);
        Integer term110798 = new Integer(407708341);
        Integer term110800 = new Integer(-287519200);
        Integer term110802 = new Integer(-1490696181);
        Integer term110804 = new Integer(623717232);
        ArrayList term110788 = new ArrayList();
        ((ArrayList) term110788).add(term110790);
        ((ArrayList) term110788).add(term110792);
        ((ArrayList) term110788).add(term110794);
        ((ArrayList) term110788).add(term110796);
        ((ArrayList) term110788).add(term110798);
        ((ArrayList) term110788).add(term110800);
        ((ArrayList) term110788).add(term110802);
        ((ArrayList) term110788).add(term110804);
        Integer term110810 = new Integer(-1413291732);
        Integer term110812 = new Integer(203264365);
        Integer term110814 = new Integer(-1066281036);
        ArrayList term110808 = new ArrayList();
        ((ArrayList) term110808).add(term110810);
        ((ArrayList) term110808).add(term110812);
        ((ArrayList) term110808).add(term110814);
        term110721 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term110723 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term110725 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term110741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110756 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term110721, term110721.getClass(), "id", 7680535193078478069L);
        setLongField(term110723, term110723.getClass(), "id", -5087018910424412847L);
        setLongField(term110725, term110725.getClass(), "id", 6714464751236187198L);
        setField(term110725, term110725.getClass(), "extId", term110727);
        setField(term110725, term110725.getClass(), "luid", "dVepDETefb");
        setIntField(term110742, term110742.getClass(), "year", 2017);
        setShortField(term110742, term110742.getClass(), "month", (short) 5);
        setShortField(term110742, term110742.getClass(), "day", (short) 2);
        setField(term110741, term110741.getClass(), "date", term110742);
        setByteField(term110746, term110746.getClass(), "hour", (byte) 7);
        setByteField(term110746, term110746.getClass(), "minute", (byte) 24);
        setByteField(term110746, term110746.getClass(), "second", (byte) 51);
        setIntField(term110746, term110746.getClass(), "nano", 706502334);
        setField(term110741, term110741.getClass(), "time", term110746);
        setField(term110725, term110725.getClass(), "registerTime", term110741);
        setIntField(term110752, term110752.getClass(), "year", 2026);
        setShortField(term110752, term110752.getClass(), "month", (short) 11);
        setShortField(term110752, term110752.getClass(), "day", (short) 1);
        setField(term110751, term110751.getClass(), "date", term110752);
        setByteField(term110756, term110756.getClass(), "hour", (byte) 9);
        setByteField(term110756, term110756.getClass(), "minute", (byte) 4);
        setByteField(term110756, term110756.getClass(), "second", (byte) 25);
        setIntField(term110756, term110756.getClass(), "nano", 272299951);
        setField(term110751, term110751.getClass(), "time", term110756);
        setField(term110725, term110725.getClass(), "accessTime", term110751);
        setField(term110723, term110723.getClass(), "card", term110725);
        setField(term110723, term110723.getClass(), "userName", "IVzSENeLxP");
        setIntField(term110723, term110723.getClass(), "isNetMember", 1957935933);
        setIntField(term110723, term110723.getClass(), "iconId", -98122007);
        setIntField(term110723, term110723.getClass(), "plateId", -1291078501);
        setIntField(term110723, term110723.getClass(), "titleId", -31110918);
        setIntField(term110723, term110723.getClass(), "partnerId", 2050293775);
        setIntField(term110723, term110723.getClass(), "frameId", 367669009);
        setIntField(term110723, term110723.getClass(), "selectMapId", 1587942890);
        setIntField(term110723, term110723.getClass(), "totalAwake", 168004133);
        setIntField(term110723, term110723.getClass(), "gradeRating", -1080740868);
        setIntField(term110723, term110723.getClass(), "musicRating", 1926882468);
        setIntField(term110723, term110723.getClass(), "playerRating", 1597443428);
        setIntField(term110723, term110723.getClass(), "highestRating", 1327091194);
        setIntField(term110723, term110723.getClass(), "gradeRank", 589230936);
        setIntField(term110723, term110723.getClass(), "classRank", -1303562294);
        setIntField(term110723, term110723.getClass(), "courseRank", -604799051);
        setField(term110723, term110723.getClass(), "charaSlot", term110788);
        setField(term110723, term110723.getClass(), "charaLockSlot", term110808);
        setLongField(term110723, term110723.getClass(), "contentBit", 5851303130674694601L);
        setIntField(term110723, term110723.getClass(), "playCount", -157085169);
        setField(term110723, term110723.getClass(), "eventWatchedDate", "XlXuNQwqYb");
        setField(term110723, term110723.getClass(), "lastGameId", "ePtDnXODVc");
        setField(term110723, term110723.getClass(), "lastRomVersion", "NupNPsPxZu");
        setField(term110723, term110723.getClass(), "lastDataVersion", "bOTZrbSitH");
        setField(term110723, term110723.getClass(), "lastLoginDate", "ojFfVocDNH");
        setField(term110723, term110723.getClass(), "lastPlayDate", "gqBOEdccip");
        setIntField(term110723, term110723.getClass(), "lastPlayCredit", -1984025761);
        setIntField(term110723, term110723.getClass(), "lastPlayMode", 1401125758);
        setIntField(term110723, term110723.getClass(), "lastPlaceId", 1507564978);
        setField(term110723, term110723.getClass(), "lastPlaceName", "biglNwhOOx");
        setIntField(term110723, term110723.getClass(), "lastAllNetId", -1187537437);
        setIntField(term110723, term110723.getClass(), "lastRegionId", 988985229);
        setField(term110723, term110723.getClass(), "lastRegionName", "mianqYKlGq");
        setField(term110723, term110723.getClass(), "lastClientId", "GmpbCvsoQd");
        setField(term110723, term110723.getClass(), "lastCountryCode", "ypYkYRcFQq");
        setIntField(term110723, term110723.getClass(), "lastSelectEMoney", -1262847411);
        setIntField(term110723, term110723.getClass(), "lastSelectTicket", -69028914);
        setIntField(term110723, term110723.getClass(), "lastSelectCourse", -887976125);
        setIntField(term110723, term110723.getClass(), "lastCountCourse", 448725036);
        setField(term110723, term110723.getClass(), "firstGameId", "lXLLmOVwcF");
        setField(term110723, term110723.getClass(), "firstRomVersion", "lIrBbPBrDY");
        setField(term110723, term110723.getClass(), "firstDataVersion", "RDqKYQTmEE");
        setField(term110723, term110723.getClass(), "firstPlayDate", "MrUUMyYAHK");
        setField(term110723, term110723.getClass(), "compatibleCmVersion", "mltJfFDGWB");
        setField(term110723, term110723.getClass(), "dailyBonusDate", "jXearfyNpX");
        setField(term110723, term110723.getClass(), "dailyCourseBonusDate", "BhmFDzFKBZ");
        setField(term110723, term110723.getClass(), "lastPairLoginDate", "LfhJOBaMfN");
        setField(term110723, term110723.getClass(), "lastTrialPlayDate", "gTpNrKjAOw");
        setIntField(term110723, term110723.getClass(), "playVsCount", -1464798371);
        setIntField(term110723, term110723.getClass(), "playSyncCount", 528481490);
        setIntField(term110723, term110723.getClass(), "winCount", -117880593);
        setIntField(term110723, term110723.getClass(), "helpCount", 482962990);
        setIntField(term110723, term110723.getClass(), "comboCount", 694510512);
        setLongField(term110723, term110723.getClass(), "totalDeluxscore", 5207188451056259477L);
        setLongField(term110723, term110723.getClass(), "totalBasicDeluxscore", 2222992701036367315L);
        setLongField(term110723, term110723.getClass(), "totalAdvancedDeluxscore", 5157280480812416804L);
        setLongField(term110723, term110723.getClass(), "totalExpertDeluxscore", -395175613445022017L);
        setLongField(term110723, term110723.getClass(), "totalMasterDeluxscore", 5277890351688411780L);
        setLongField(term110723, term110723.getClass(), "totalReMasterDeluxscore", -2273888712789178637L);
        setIntField(term110723, term110723.getClass(), "totalSync", 1668115404);
        setIntField(term110723, term110723.getClass(), "totalBasicSync", -1244092546);
        setIntField(term110723, term110723.getClass(), "totalAdvancedSync", -939472836);
        setIntField(term110723, term110723.getClass(), "totalExpertSync", 924950442);
        setIntField(term110723, term110723.getClass(), "totalMasterSync", 154444104);
        setIntField(term110723, term110723.getClass(), "totalReMasterSync", 1812340862);
        setLongField(term110723, term110723.getClass(), "totalAchievement", 8650829777139339546L);
        setLongField(term110723, term110723.getClass(), "totalBasicAchievement", 1551275957786651375L);
        setLongField(term110723, term110723.getClass(), "totalAdvancedAchievement", -8133980169971902787L);
        setLongField(term110723, term110723.getClass(), "totalExpertAchievement", 5673377792803416715L);
        setLongField(term110723, term110723.getClass(), "totalMasterAchievement", -5845866725216038244L);
        setLongField(term110723, term110723.getClass(), "totalReMasterAchievement", -477169378661100925L);
        setLongField(term110723, term110723.getClass(), "playerOldRating", -3072190488587286945L);
        setLongField(term110723, term110723.getClass(), "playerNewRating", 1314642074606264885L);
        setIntField(term110723, term110723.getClass(), "banState", 1048628494);
        setLongField(term110723, term110723.getClass(), "dateTime", 2939609310992671627L);
        setField(term110721, term110721.getClass(), "user", term110723);
        setIntField(term110721, term110721.getClass(), "rate", -1259863856);
        setIntField(term110721, term110721.getClass(), "maxRate", 259620797);
        setIntField(term110721, term110721.getClass(), "classValue", 592523230);
        setIntField(term110721, term110721.getClass(), "maxClassValue", 729128701);
        setIntField(term110721, term110721.getClass(), "totalWinNum", -1990251566);
        setIntField(term110721, term110721.getClass(), "totalLoseNum", 234165066);
        setIntField(term110721, term110721.getClass(), "maxWinNum", 1223931792);
        setIntField(term110721, term110721.getClass(), "maxLoseNum", 1032967382);
        setIntField(term110721, term110721.getClass(), "winNum", 832942795);
        setIntField(term110721, term110721.getClass(), "loseNum", 1812644002);
        setIntField(term110721, term110721.getClass(), "npcTotalWinNum", -701090454);
        setIntField(term110721, term110721.getClass(), "npcTotalLoseNum", -1986771984);
        setIntField(term110721, term110721.getClass(), "npcMaxWinNum", -1975052346);
        setIntField(term110721, term110721.getClass(), "npcMaxLoseNum", -619909309);
        setIntField(term110721, term110721.getClass(), "npcWinNum", 277279565);
        setIntField(term110721, term110721.getClass(), "npcLoseNum", -1030236289);
        term111100 = new Integer(-568331388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term111100;
        callMethod(klass, "setMaxWinNum", argTypes, term110721, args);
    }

};


