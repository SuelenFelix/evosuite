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

public class UserData_getMasterTutorialCancelNum_527415345225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4213423;

    public UserData_getMasterTutorialCancelNum_527415345225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4213423 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4213423, term4213423.getClass(), "id", 0L);
        setField(term4213423, term4213423.getClass(), "card", null);
        setField(term4213423, term4213423.getClass(), "userName", null);
        setIntField(term4213423, term4213423.getClass(), "level", 0);
        setIntField(term4213423, term4213423.getClass(), "reincarnationNum", 0);
        setField(term4213423, term4213423.getClass(), "exp", null);
        setLongField(term4213423, term4213423.getClass(), "point", 0L);
        setLongField(term4213423, term4213423.getClass(), "totalPoint", 0L);
        setIntField(term4213423, term4213423.getClass(), "playCount", 0);
        setIntField(term4213423, term4213423.getClass(), "multiPlayCount", 0);
        setIntField(term4213423, term4213423.getClass(), "playerRating", 0);
        setIntField(term4213423, term4213423.getClass(), "highestRating", 0);
        setIntField(term4213423, term4213423.getClass(), "nameplateId", 0);
        setIntField(term4213423, term4213423.getClass(), "frameId", 0);
        setIntField(term4213423, term4213423.getClass(), "characterId", 0);
        setIntField(term4213423, term4213423.getClass(), "trophyId", 0);
        setIntField(term4213423, term4213423.getClass(), "playedTutorialBit", 0);
        setIntField(term4213423, term4213423.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4213423, term4213423.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4213423, term4213423.getClass(), "totalMapNum", 0);
        setLongField(term4213423, term4213423.getClass(), "totalHiScore", 0L);
        setLongField(term4213423, term4213423.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4213423, term4213423.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4213423, term4213423.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4213423, term4213423.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4213423, term4213423.getClass(), "totalUltimaHighScore", 0L);
        setField(term4213423, term4213423.getClass(), "eventWatchedDate", null);
        setIntField(term4213423, term4213423.getClass(), "friendCount", 0);
        setField(term4213423, term4213423.getClass(), "firstGameId", null);
        setField(term4213423, term4213423.getClass(), "firstRomVersion", null);
        setField(term4213423, term4213423.getClass(), "firstDataVersion", null);
        setField(term4213423, term4213423.getClass(), "firstPlayDate", null);
        setField(term4213423, term4213423.getClass(), "lastGameId", null);
        setField(term4213423, term4213423.getClass(), "lastRomVersion", null);
        setField(term4213423, term4213423.getClass(), "lastDataVersion", null);
        setField(term4213423, term4213423.getClass(), "lastLoginDate", null);
        setField(term4213423, term4213423.getClass(), "lastPlayDate", null);
        setIntField(term4213423, term4213423.getClass(), "lastPlaceId", 0);
        setField(term4213423, term4213423.getClass(), "lastPlaceName", null);
        setField(term4213423, term4213423.getClass(), "lastRegionId", null);
        setField(term4213423, term4213423.getClass(), "lastRegionName", null);
        setField(term4213423, term4213423.getClass(), "lastAllNetId", null);
        setField(term4213423, term4213423.getClass(), "lastClientId", null);
        setField(term4213423, term4213423.getClass(), "lastCountryCode", null);
        setField(term4213423, term4213423.getClass(), "userNameEx", null);
        setField(term4213423, term4213423.getClass(), "compatibleCmVersion", null);
        setIntField(term4213423, term4213423.getClass(), "medal", 0);
        setIntField(term4213423, term4213423.getClass(), "mapIconId", 0);
        setIntField(term4213423, term4213423.getClass(), "voiceId", 0);
        setIntField(term4213423, term4213423.getClass(), "avatarWear", 0);
        setIntField(term4213423, term4213423.getClass(), "avatarHead", 0);
        setIntField(term4213423, term4213423.getClass(), "avatarFace", 0);
        setIntField(term4213423, term4213423.getClass(), "avatarSkin", 0);
        setIntField(term4213423, term4213423.getClass(), "avatarItem", 0);
        setIntField(term4213423, term4213423.getClass(), "avatarFront", 0);
        setIntField(term4213423, term4213423.getClass(), "avatarBack", 0);
        setIntField(term4213423, term4213423.getClass(), "classEmblemBase", 0);
        setIntField(term4213423, term4213423.getClass(), "classEmblemMedal", 0);
        setIntField(term4213423, term4213423.getClass(), "stockedGridCount", 0);
        setIntField(term4213423, term4213423.getClass(), "exMapLoopCount", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattlePlayCount", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattleWinCount", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattleLoseCount", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4213423, term4213423.getClass(), "charaIllustId", 0);
        setIntField(term4213423, term4213423.getClass(), "skillId", 0);
        setIntField(term4213423, term4213423.getClass(), "overPowerPoint", 0);
        setIntField(term4213423, term4213423.getClass(), "overPowerRate", 0);
        setIntField(term4213423, term4213423.getClass(), "overPowerLowerRank", 0);
        setIntField(term4213423, term4213423.getClass(), "avatarPoint", 0);
        setIntField(term4213423, term4213423.getClass(), "battleRankId", 0);
        setIntField(term4213423, term4213423.getClass(), "battleRankPoint", 0);
        setIntField(term4213423, term4213423.getClass(), "eliteRankPoint", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattle1stCount", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattle2ndCount", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattle3rdCount", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattle4thCount", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattleCorrection", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattleErrCnt", 0);
        setIntField(term4213423, term4213423.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4213423, term4213423.getClass(), "battleRewardStatus", 0);
        setIntField(term4213423, term4213423.getClass(), "battleRewardIndex", 0);
        setIntField(term4213423, term4213423.getClass(), "battleRewardCount", 0);
        setIntField(term4213423, term4213423.getClass(), "ext1", 0);
        setIntField(term4213423, term4213423.getClass(), "ext2", 0);
        setIntField(term4213423, term4213423.getClass(), "ext3", 0);
        setIntField(term4213423, term4213423.getClass(), "ext4", 0);
        setIntField(term4213423, term4213423.getClass(), "ext5", 0);
        setIntField(term4213423, term4213423.getClass(), "ext6", 0);
        setIntField(term4213423, term4213423.getClass(), "ext7", 0);
        setIntField(term4213423, term4213423.getClass(), "ext8", 0);
        setIntField(term4213423, term4213423.getClass(), "ext9", 0);
        setIntField(term4213423, term4213423.getClass(), "ext10", 0);
        setField(term4213423, term4213423.getClass(), "extStr1", null);
        setField(term4213423, term4213423.getClass(), "extStr2", null);
        setLongField(term4213423, term4213423.getClass(), "extLong1", 0L);
        setLongField(term4213423, term4213423.getClass(), "extLong2", 0L);
        setField(term4213423, term4213423.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4213423, term4213423.getClass(), "isNetBattleHost", false);
        setIntField(term4213423, term4213423.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMasterTutorialCancelNum", argTypes, term4213423, args);
    }

};


