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

public class UserData_getClassEmblemBase_1055775226262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281748;

    public UserData_getClassEmblemBase_1055775226262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281748 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term281748, term281748.getClass(), "id", 0L);
        setField(term281748, term281748.getClass(), "card", null);
        setField(term281748, term281748.getClass(), "userName", null);
        setIntField(term281748, term281748.getClass(), "level", 0);
        setIntField(term281748, term281748.getClass(), "reincarnationNum", 0);
        setField(term281748, term281748.getClass(), "exp", null);
        setLongField(term281748, term281748.getClass(), "point", 0L);
        setLongField(term281748, term281748.getClass(), "totalPoint", 0L);
        setIntField(term281748, term281748.getClass(), "playCount", 0);
        setIntField(term281748, term281748.getClass(), "multiPlayCount", 0);
        setIntField(term281748, term281748.getClass(), "playerRating", 0);
        setIntField(term281748, term281748.getClass(), "highestRating", 0);
        setIntField(term281748, term281748.getClass(), "nameplateId", 0);
        setIntField(term281748, term281748.getClass(), "frameId", 0);
        setIntField(term281748, term281748.getClass(), "characterId", 0);
        setIntField(term281748, term281748.getClass(), "trophyId", 0);
        setIntField(term281748, term281748.getClass(), "playedTutorialBit", 0);
        setIntField(term281748, term281748.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term281748, term281748.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term281748, term281748.getClass(), "totalMapNum", 0);
        setLongField(term281748, term281748.getClass(), "totalHiScore", 0L);
        setLongField(term281748, term281748.getClass(), "totalBasicHighScore", 0L);
        setLongField(term281748, term281748.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term281748, term281748.getClass(), "totalExpertHighScore", 0L);
        setLongField(term281748, term281748.getClass(), "totalMasterHighScore", 0L);
        setLongField(term281748, term281748.getClass(), "totalUltimaHighScore", 0L);
        setField(term281748, term281748.getClass(), "eventWatchedDate", null);
        setIntField(term281748, term281748.getClass(), "friendCount", 0);
        setField(term281748, term281748.getClass(), "firstGameId", null);
        setField(term281748, term281748.getClass(), "firstRomVersion", null);
        setField(term281748, term281748.getClass(), "firstDataVersion", null);
        setField(term281748, term281748.getClass(), "firstPlayDate", null);
        setField(term281748, term281748.getClass(), "lastGameId", null);
        setField(term281748, term281748.getClass(), "lastRomVersion", null);
        setField(term281748, term281748.getClass(), "lastDataVersion", null);
        setField(term281748, term281748.getClass(), "lastLoginDate", null);
        setField(term281748, term281748.getClass(), "lastPlayDate", null);
        setIntField(term281748, term281748.getClass(), "lastPlaceId", 0);
        setField(term281748, term281748.getClass(), "lastPlaceName", null);
        setField(term281748, term281748.getClass(), "lastRegionId", null);
        setField(term281748, term281748.getClass(), "lastRegionName", null);
        setField(term281748, term281748.getClass(), "lastAllNetId", null);
        setField(term281748, term281748.getClass(), "lastClientId", null);
        setField(term281748, term281748.getClass(), "lastCountryCode", null);
        setField(term281748, term281748.getClass(), "userNameEx", null);
        setField(term281748, term281748.getClass(), "compatibleCmVersion", null);
        setIntField(term281748, term281748.getClass(), "medal", 0);
        setIntField(term281748, term281748.getClass(), "mapIconId", 0);
        setIntField(term281748, term281748.getClass(), "voiceId", 0);
        setIntField(term281748, term281748.getClass(), "avatarWear", 0);
        setIntField(term281748, term281748.getClass(), "avatarHead", 0);
        setIntField(term281748, term281748.getClass(), "avatarFace", 0);
        setIntField(term281748, term281748.getClass(), "avatarSkin", 0);
        setIntField(term281748, term281748.getClass(), "avatarItem", 0);
        setIntField(term281748, term281748.getClass(), "avatarFront", 0);
        setIntField(term281748, term281748.getClass(), "avatarBack", 0);
        setIntField(term281748, term281748.getClass(), "classEmblemBase", 0);
        setIntField(term281748, term281748.getClass(), "classEmblemMedal", 0);
        setIntField(term281748, term281748.getClass(), "stockedGridCount", 0);
        setIntField(term281748, term281748.getClass(), "exMapLoopCount", 0);
        setIntField(term281748, term281748.getClass(), "netBattlePlayCount", 0);
        setIntField(term281748, term281748.getClass(), "netBattleWinCount", 0);
        setIntField(term281748, term281748.getClass(), "netBattleLoseCount", 0);
        setIntField(term281748, term281748.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term281748, term281748.getClass(), "charaIllustId", 0);
        setIntField(term281748, term281748.getClass(), "skillId", 0);
        setIntField(term281748, term281748.getClass(), "overPowerPoint", 0);
        setIntField(term281748, term281748.getClass(), "overPowerRate", 0);
        setIntField(term281748, term281748.getClass(), "overPowerLowerRank", 0);
        setIntField(term281748, term281748.getClass(), "avatarPoint", 0);
        setIntField(term281748, term281748.getClass(), "battleRankId", 0);
        setIntField(term281748, term281748.getClass(), "battleRankPoint", 0);
        setIntField(term281748, term281748.getClass(), "eliteRankPoint", 0);
        setIntField(term281748, term281748.getClass(), "netBattle1stCount", 0);
        setIntField(term281748, term281748.getClass(), "netBattle2ndCount", 0);
        setIntField(term281748, term281748.getClass(), "netBattle3rdCount", 0);
        setIntField(term281748, term281748.getClass(), "netBattle4thCount", 0);
        setIntField(term281748, term281748.getClass(), "netBattleCorrection", 0);
        setIntField(term281748, term281748.getClass(), "netBattleErrCnt", 0);
        setIntField(term281748, term281748.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term281748, term281748.getClass(), "battleRewardStatus", 0);
        setIntField(term281748, term281748.getClass(), "battleRewardIndex", 0);
        setIntField(term281748, term281748.getClass(), "battleRewardCount", 0);
        setIntField(term281748, term281748.getClass(), "ext1", 0);
        setIntField(term281748, term281748.getClass(), "ext2", 0);
        setIntField(term281748, term281748.getClass(), "ext3", 0);
        setIntField(term281748, term281748.getClass(), "ext4", 0);
        setIntField(term281748, term281748.getClass(), "ext5", 0);
        setIntField(term281748, term281748.getClass(), "ext6", 0);
        setIntField(term281748, term281748.getClass(), "ext7", 0);
        setIntField(term281748, term281748.getClass(), "ext8", 0);
        setIntField(term281748, term281748.getClass(), "ext9", 0);
        setIntField(term281748, term281748.getClass(), "ext10", 0);
        setField(term281748, term281748.getClass(), "extStr1", null);
        setField(term281748, term281748.getClass(), "extStr2", null);
        setLongField(term281748, term281748.getClass(), "extLong1", 0L);
        setLongField(term281748, term281748.getClass(), "extLong2", 0L);
        setField(term281748, term281748.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term281748, term281748.getClass(), "isNetBattleHost", false);
        setIntField(term281748, term281748.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassEmblemBase", argTypes, term281748, args);
    }

};


