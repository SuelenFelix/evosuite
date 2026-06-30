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

public class UserExtend_getSelectScoreType_18960806798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146148;

    public UserExtend_getSelectScoreType_18960806798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146154 = new Long(21047099434645581L);
        Integer term146217 = new Integer(1970023149);
        Integer term146219 = new Integer(-336351735);
        ArrayList term146215 = new ArrayList();
        ((ArrayList) term146215).add(term146217);
        ((ArrayList) term146215).add(term146219);
        ArrayList term146223 = new ArrayList();
        Integer term146507 = new Integer(1938932230);
        Integer term146509 = new Integer(1128720609);
        Integer term146511 = new Integer(216265002);
        Integer term146513 = new Integer(-97405660);
        Integer term146515 = new Integer(872278468);
        Integer term146517 = new Integer(-1003390920);
        Integer term146519 = new Integer(-2052568448);
        ArrayList term146505 = new ArrayList();
        ((ArrayList) term146505).add(term146507);
        ((ArrayList) term146505).add(term146509);
        ((ArrayList) term146505).add(term146511);
        ((ArrayList) term146505).add(term146513);
        ((ArrayList) term146505).add(term146515);
        ((ArrayList) term146505).add(term146517);
        ((ArrayList) term146505).add(term146519);
        ArrayList term146523 = new ArrayList();
        term146148 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term146150 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term146152 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146173 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146183 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term146148, term146148.getClass(), "id", -5593770341473146640L);
        setLongField(term146150, term146150.getClass(), "id", 6496629583300657659L);
        setLongField(term146152, term146152.getClass(), "id", 2629323353523802483L);
        setField(term146152, term146152.getClass(), "extId", term146154);
        setField(term146152, term146152.getClass(), "luid", "rwsydXSAIm");
        setIntField(term146169, term146169.getClass(), "year", 2014);
        setShortField(term146169, term146169.getClass(), "month", (short) 6);
        setShortField(term146169, term146169.getClass(), "day", (short) 26);
        setField(term146168, term146168.getClass(), "date", term146169);
        setByteField(term146173, term146173.getClass(), "hour", (byte) 1);
        setByteField(term146173, term146173.getClass(), "minute", (byte) 48);
        setByteField(term146173, term146173.getClass(), "second", (byte) 51);
        setIntField(term146173, term146173.getClass(), "nano", 770527454);
        setField(term146168, term146168.getClass(), "time", term146173);
        setField(term146152, term146152.getClass(), "registerTime", term146168);
        setIntField(term146179, term146179.getClass(), "year", 2019);
        setShortField(term146179, term146179.getClass(), "month", (short) 10);
        setShortField(term146179, term146179.getClass(), "day", (short) 21);
        setField(term146178, term146178.getClass(), "date", term146179);
        setByteField(term146183, term146183.getClass(), "hour", (byte) 23);
        setByteField(term146183, term146183.getClass(), "minute", (byte) 33);
        setByteField(term146183, term146183.getClass(), "second", (byte) 19);
        setIntField(term146183, term146183.getClass(), "nano", 72784109);
        setField(term146178, term146178.getClass(), "time", term146183);
        setField(term146152, term146152.getClass(), "accessTime", term146178);
        setField(term146150, term146150.getClass(), "card", term146152);
        setField(term146150, term146150.getClass(), "userName", "PXtEfvnxXo");
        setIntField(term146150, term146150.getClass(), "isNetMember", 1086303241);
        setIntField(term146150, term146150.getClass(), "iconId", 602126411);
        setIntField(term146150, term146150.getClass(), "plateId", -1382786777);
        setIntField(term146150, term146150.getClass(), "titleId", -653869267);
        setIntField(term146150, term146150.getClass(), "partnerId", 2108460000);
        setIntField(term146150, term146150.getClass(), "frameId", 464860665);
        setIntField(term146150, term146150.getClass(), "selectMapId", -829472053);
        setIntField(term146150, term146150.getClass(), "totalAwake", 1237212779);
        setIntField(term146150, term146150.getClass(), "gradeRating", -733200940);
        setIntField(term146150, term146150.getClass(), "musicRating", -2099756995);
        setIntField(term146150, term146150.getClass(), "playerRating", 146626977);
        setIntField(term146150, term146150.getClass(), "highestRating", 588479166);
        setIntField(term146150, term146150.getClass(), "gradeRank", 555940372);
        setIntField(term146150, term146150.getClass(), "classRank", 303574393);
        setIntField(term146150, term146150.getClass(), "courseRank", -837749919);
        setField(term146150, term146150.getClass(), "charaSlot", term146215);
        setField(term146150, term146150.getClass(), "charaLockSlot", term146223);
        setLongField(term146150, term146150.getClass(), "contentBit", 4634293118023415749L);
        setIntField(term146150, term146150.getClass(), "playCount", -56371414);
        setField(term146150, term146150.getClass(), "eventWatchedDate", "VRanEGfPea");
        setField(term146150, term146150.getClass(), "lastGameId", "aGdROcHtyG");
        setField(term146150, term146150.getClass(), "lastRomVersion", "grxNCPTaxQ");
        setField(term146150, term146150.getClass(), "lastDataVersion", "VSAOMfeZza");
        setField(term146150, term146150.getClass(), "lastLoginDate", "SfwPnHKjAh");
        setField(term146150, term146150.getClass(), "lastPlayDate", "slVCZJOwTn");
        setIntField(term146150, term146150.getClass(), "lastPlayCredit", 1655747400);
        setIntField(term146150, term146150.getClass(), "lastPlayMode", 1345032092);
        setIntField(term146150, term146150.getClass(), "lastPlaceId", 953985132);
        setField(term146150, term146150.getClass(), "lastPlaceName", "wyOXHOMKYx");
        setIntField(term146150, term146150.getClass(), "lastAllNetId", -1177278432);
        setIntField(term146150, term146150.getClass(), "lastRegionId", -467461131);
        setField(term146150, term146150.getClass(), "lastRegionName", "rvkJHBxSuS");
        setField(term146150, term146150.getClass(), "lastClientId", "XChVAzyqqj");
        setField(term146150, term146150.getClass(), "lastCountryCode", "niqsKibyMX");
        setIntField(term146150, term146150.getClass(), "lastSelectEMoney", 1619548087);
        setIntField(term146150, term146150.getClass(), "lastSelectTicket", -661818935);
        setIntField(term146150, term146150.getClass(), "lastSelectCourse", 263615284);
        setIntField(term146150, term146150.getClass(), "lastCountCourse", -1940382171);
        setField(term146150, term146150.getClass(), "firstGameId", "EEigYHpeLr");
        setField(term146150, term146150.getClass(), "firstRomVersion", "iOZRBGDCUA");
        setField(term146150, term146150.getClass(), "firstDataVersion", "SNLGmwYLAV");
        setField(term146150, term146150.getClass(), "firstPlayDate", "FskwpQdCkf");
        setField(term146150, term146150.getClass(), "compatibleCmVersion", "GQONGOQPIz");
        setField(term146150, term146150.getClass(), "dailyBonusDate", "IjWJbokDwC");
        setField(term146150, term146150.getClass(), "dailyCourseBonusDate", "CgjnSgLArx");
        setField(term146150, term146150.getClass(), "lastPairLoginDate", "VDsGrlxIKZ");
        setField(term146150, term146150.getClass(), "lastTrialPlayDate", "WWdkxUzoEC");
        setIntField(term146150, term146150.getClass(), "playVsCount", 1646141136);
        setIntField(term146150, term146150.getClass(), "playSyncCount", 1608131433);
        setIntField(term146150, term146150.getClass(), "winCount", 97138194);
        setIntField(term146150, term146150.getClass(), "helpCount", -744642234);
        setIntField(term146150, term146150.getClass(), "comboCount", -349460490);
        setLongField(term146150, term146150.getClass(), "totalDeluxscore", -1746705594173317645L);
        setLongField(term146150, term146150.getClass(), "totalBasicDeluxscore", -4351156485678193124L);
        setLongField(term146150, term146150.getClass(), "totalAdvancedDeluxscore", -3274901946251283016L);
        setLongField(term146150, term146150.getClass(), "totalExpertDeluxscore", -1191915632110205259L);
        setLongField(term146150, term146150.getClass(), "totalMasterDeluxscore", -109837841494633251L);
        setLongField(term146150, term146150.getClass(), "totalReMasterDeluxscore", -1968874635471618257L);
        setIntField(term146150, term146150.getClass(), "totalSync", 1945749170);
        setIntField(term146150, term146150.getClass(), "totalBasicSync", -282883918);
        setIntField(term146150, term146150.getClass(), "totalAdvancedSync", -1576666542);
        setIntField(term146150, term146150.getClass(), "totalExpertSync", 622981013);
        setIntField(term146150, term146150.getClass(), "totalMasterSync", -2054776518);
        setIntField(term146150, term146150.getClass(), "totalReMasterSync", -2002407733);
        setLongField(term146150, term146150.getClass(), "totalAchievement", 7746286716986335503L);
        setLongField(term146150, term146150.getClass(), "totalBasicAchievement", -83739886134866568L);
        setLongField(term146150, term146150.getClass(), "totalAdvancedAchievement", -6617693381241289068L);
        setLongField(term146150, term146150.getClass(), "totalExpertAchievement", -4638865229187525010L);
        setLongField(term146150, term146150.getClass(), "totalMasterAchievement", -7661181241933749873L);
        setLongField(term146150, term146150.getClass(), "totalReMasterAchievement", 4515262739708705481L);
        setLongField(term146150, term146150.getClass(), "playerOldRating", 2663732911776823170L);
        setLongField(term146150, term146150.getClass(), "playerNewRating", 2961405755335562807L);
        setIntField(term146150, term146150.getClass(), "banState", 2079703600);
        setLongField(term146150, term146150.getClass(), "dateTime", 2293978650158859539L);
        setField(term146148, term146148.getClass(), "user", term146150);
        setIntField(term146148, term146148.getClass(), "selectMusicId", -1747428341);
        setIntField(term146148, term146148.getClass(), "selectDifficultyId", 1506522067);
        setIntField(term146148, term146148.getClass(), "categoryIndex", -1563374460);
        setIntField(term146148, term146148.getClass(), "musicIndex", 1292095065);
        setIntField(term146148, term146148.getClass(), "extraFlag", 729473915);
        setIntField(term146148, term146148.getClass(), "selectScoreType", -1969775161);
        setLongField(term146148, term146148.getClass(), "extendContentBit", -3211895931243279160L);
        setBooleanField(term146148, term146148.getClass(), "isPhotoAgree", false);
        setBooleanField(term146148, term146148.getClass(), "isGotoCodeRead", false);
        setBooleanField(term146148, term146148.getClass(), "selectResultDetails", true);
        setIntField(term146148, term146148.getClass(), "sortCategorySetting", 2036970097);
        setIntField(term146148, term146148.getClass(), "sortMusicSetting", 412620735);
        setField(term146148, term146148.getClass(), "selectedCardList", term146505);
        setField(term146148, term146148.getClass(), "encountMapNpcList", term146523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectScoreType", argTypes, term146148, args);
    }

};


