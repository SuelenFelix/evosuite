package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getExt2_33242048290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283904;

    public UserData_getExt2_33242048290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283904 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term283904, term283904.getClass(), "id", 0L);
        setField(term283904, term283904.getClass(), "card", null);
        setField(term283904, term283904.getClass(), "userName", null);
        setIntField(term283904, term283904.getClass(), "level", 0);
        setIntField(term283904, term283904.getClass(), "reincarnationNum", 0);
        setField(term283904, term283904.getClass(), "exp", null);
        setLongField(term283904, term283904.getClass(), "point", 0L);
        setLongField(term283904, term283904.getClass(), "totalPoint", 0L);
        setIntField(term283904, term283904.getClass(), "playCount", 0);
        setIntField(term283904, term283904.getClass(), "multiPlayCount", 0);
        setIntField(term283904, term283904.getClass(), "playerRating", 0);
        setIntField(term283904, term283904.getClass(), "highestRating", 0);
        setIntField(term283904, term283904.getClass(), "nameplateId", 0);
        setIntField(term283904, term283904.getClass(), "frameId", 0);
        setIntField(term283904, term283904.getClass(), "characterId", 0);
        setIntField(term283904, term283904.getClass(), "trophyId", 0);
        setIntField(term283904, term283904.getClass(), "playedTutorialBit", 0);
        setIntField(term283904, term283904.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term283904, term283904.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term283904, term283904.getClass(), "totalMapNum", 0);
        setLongField(term283904, term283904.getClass(), "totalHiScore", 0L);
        setLongField(term283904, term283904.getClass(), "totalBasicHighScore", 0L);
        setLongField(term283904, term283904.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term283904, term283904.getClass(), "totalExpertHighScore", 0L);
        setLongField(term283904, term283904.getClass(), "totalMasterHighScore", 0L);
        setLongField(term283904, term283904.getClass(), "totalUltimaHighScore", 0L);
        setField(term283904, term283904.getClass(), "eventWatchedDate", null);
        setIntField(term283904, term283904.getClass(), "friendCount", 0);
        setField(term283904, term283904.getClass(), "firstGameId", null);
        setField(term283904, term283904.getClass(), "firstRomVersion", null);
        setField(term283904, term283904.getClass(), "firstDataVersion", null);
        setField(term283904, term283904.getClass(), "firstPlayDate", null);
        setField(term283904, term283904.getClass(), "lastGameId", null);
        setField(term283904, term283904.getClass(), "lastRomVersion", null);
        setField(term283904, term283904.getClass(), "lastDataVersion", null);
        setField(term283904, term283904.getClass(), "lastLoginDate", null);
        setField(term283904, term283904.getClass(), "lastPlayDate", null);
        setIntField(term283904, term283904.getClass(), "lastPlaceId", 0);
        setField(term283904, term283904.getClass(), "lastPlaceName", null);
        setField(term283904, term283904.getClass(), "lastRegionId", null);
        setField(term283904, term283904.getClass(), "lastRegionName", null);
        setField(term283904, term283904.getClass(), "lastAllNetId", null);
        setField(term283904, term283904.getClass(), "lastClientId", null);
        setField(term283904, term283904.getClass(), "lastCountryCode", null);
        setField(term283904, term283904.getClass(), "userNameEx", null);
        setField(term283904, term283904.getClass(), "compatibleCmVersion", null);
        setIntField(term283904, term283904.getClass(), "medal", 0);
        setIntField(term283904, term283904.getClass(), "mapIconId", 0);
        setIntField(term283904, term283904.getClass(), "voiceId", 0);
        setIntField(term283904, term283904.getClass(), "avatarWear", 0);
        setIntField(term283904, term283904.getClass(), "avatarHead", 0);
        setIntField(term283904, term283904.getClass(), "avatarFace", 0);
        setIntField(term283904, term283904.getClass(), "avatarSkin", 0);
        setIntField(term283904, term283904.getClass(), "avatarItem", 0);
        setIntField(term283904, term283904.getClass(), "avatarFront", 0);
        setIntField(term283904, term283904.getClass(), "avatarBack", 0);
        setIntField(term283904, term283904.getClass(), "classEmblemBase", 0);
        setIntField(term283904, term283904.getClass(), "classEmblemMedal", 0);
        setIntField(term283904, term283904.getClass(), "stockedGridCount", 0);
        setIntField(term283904, term283904.getClass(), "exMapLoopCount", 0);
        setIntField(term283904, term283904.getClass(), "netBattlePlayCount", 0);
        setIntField(term283904, term283904.getClass(), "netBattleWinCount", 0);
        setIntField(term283904, term283904.getClass(), "netBattleLoseCount", 0);
        setIntField(term283904, term283904.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term283904, term283904.getClass(), "charaIllustId", 0);
        setIntField(term283904, term283904.getClass(), "skillId", 0);
        setIntField(term283904, term283904.getClass(), "overPowerPoint", 0);
        setIntField(term283904, term283904.getClass(), "overPowerRate", 0);
        setIntField(term283904, term283904.getClass(), "overPowerLowerRank", 0);
        setIntField(term283904, term283904.getClass(), "avatarPoint", 0);
        setIntField(term283904, term283904.getClass(), "battleRankId", 0);
        setIntField(term283904, term283904.getClass(), "battleRankPoint", 0);
        setIntField(term283904, term283904.getClass(), "eliteRankPoint", 0);
        setIntField(term283904, term283904.getClass(), "netBattle1stCount", 0);
        setIntField(term283904, term283904.getClass(), "netBattle2ndCount", 0);
        setIntField(term283904, term283904.getClass(), "netBattle3rdCount", 0);
        setIntField(term283904, term283904.getClass(), "netBattle4thCount", 0);
        setIntField(term283904, term283904.getClass(), "netBattleCorrection", 0);
        setIntField(term283904, term283904.getClass(), "netBattleErrCnt", 0);
        setIntField(term283904, term283904.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term283904, term283904.getClass(), "battleRewardStatus", 0);
        setIntField(term283904, term283904.getClass(), "battleRewardIndex", 0);
        setIntField(term283904, term283904.getClass(), "battleRewardCount", 0);
        setIntField(term283904, term283904.getClass(), "ext1", 0);
        setIntField(term283904, term283904.getClass(), "ext2", 0);
        setIntField(term283904, term283904.getClass(), "ext3", 0);
        setIntField(term283904, term283904.getClass(), "ext4", 0);
        setIntField(term283904, term283904.getClass(), "ext5", 0);
        setIntField(term283904, term283904.getClass(), "ext6", 0);
        setIntField(term283904, term283904.getClass(), "ext7", 0);
        setIntField(term283904, term283904.getClass(), "ext8", 0);
        setIntField(term283904, term283904.getClass(), "ext9", 0);
        setIntField(term283904, term283904.getClass(), "ext10", 0);
        setField(term283904, term283904.getClass(), "extStr1", null);
        setField(term283904, term283904.getClass(), "extStr2", null);
        setLongField(term283904, term283904.getClass(), "extLong1", 0L);
        setLongField(term283904, term283904.getClass(), "extLong2", 0L);
        setField(term283904, term283904.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term283904, term283904.getClass(), "isNetBattleHost", false);
        setIntField(term283904, term283904.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt2", argTypes, term283904, args);
    }

};


