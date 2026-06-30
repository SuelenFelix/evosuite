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
import java.lang.Integer;

public class UserData_setAvatarSkin_1246563911358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289202;
     Object term289279;

    public UserData_setAvatarSkin_1246563911358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289202 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289202, term289202.getClass(), "id", 0L);
        setField(term289202, term289202.getClass(), "card", null);
        setField(term289202, term289202.getClass(), "userName", null);
        setIntField(term289202, term289202.getClass(), "level", 0);
        setIntField(term289202, term289202.getClass(), "reincarnationNum", 0);
        setField(term289202, term289202.getClass(), "exp", null);
        setLongField(term289202, term289202.getClass(), "point", 0L);
        setLongField(term289202, term289202.getClass(), "totalPoint", 0L);
        setIntField(term289202, term289202.getClass(), "playCount", 0);
        setIntField(term289202, term289202.getClass(), "multiPlayCount", 0);
        setIntField(term289202, term289202.getClass(), "playerRating", 0);
        setIntField(term289202, term289202.getClass(), "highestRating", 0);
        setIntField(term289202, term289202.getClass(), "nameplateId", 0);
        setIntField(term289202, term289202.getClass(), "frameId", 0);
        setIntField(term289202, term289202.getClass(), "characterId", 0);
        setIntField(term289202, term289202.getClass(), "trophyId", 0);
        setIntField(term289202, term289202.getClass(), "playedTutorialBit", 0);
        setIntField(term289202, term289202.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289202, term289202.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289202, term289202.getClass(), "totalMapNum", 0);
        setLongField(term289202, term289202.getClass(), "totalHiScore", 0L);
        setLongField(term289202, term289202.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289202, term289202.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289202, term289202.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289202, term289202.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289202, term289202.getClass(), "totalUltimaHighScore", 0L);
        setField(term289202, term289202.getClass(), "eventWatchedDate", null);
        setIntField(term289202, term289202.getClass(), "friendCount", 0);
        setField(term289202, term289202.getClass(), "firstGameId", null);
        setField(term289202, term289202.getClass(), "firstRomVersion", null);
        setField(term289202, term289202.getClass(), "firstDataVersion", null);
        setField(term289202, term289202.getClass(), "firstPlayDate", null);
        setField(term289202, term289202.getClass(), "lastGameId", null);
        setField(term289202, term289202.getClass(), "lastRomVersion", null);
        setField(term289202, term289202.getClass(), "lastDataVersion", null);
        setField(term289202, term289202.getClass(), "lastLoginDate", null);
        setField(term289202, term289202.getClass(), "lastPlayDate", null);
        setIntField(term289202, term289202.getClass(), "lastPlaceId", 0);
        setField(term289202, term289202.getClass(), "lastPlaceName", null);
        setField(term289202, term289202.getClass(), "lastRegionId", null);
        setField(term289202, term289202.getClass(), "lastRegionName", null);
        setField(term289202, term289202.getClass(), "lastAllNetId", null);
        setField(term289202, term289202.getClass(), "lastClientId", null);
        setField(term289202, term289202.getClass(), "lastCountryCode", null);
        setField(term289202, term289202.getClass(), "userNameEx", null);
        setField(term289202, term289202.getClass(), "compatibleCmVersion", null);
        setIntField(term289202, term289202.getClass(), "medal", 0);
        setIntField(term289202, term289202.getClass(), "mapIconId", 0);
        setIntField(term289202, term289202.getClass(), "voiceId", 0);
        setIntField(term289202, term289202.getClass(), "avatarWear", 0);
        setIntField(term289202, term289202.getClass(), "avatarHead", 0);
        setIntField(term289202, term289202.getClass(), "avatarFace", 0);
        setIntField(term289202, term289202.getClass(), "avatarSkin", 0);
        setIntField(term289202, term289202.getClass(), "avatarItem", 0);
        setIntField(term289202, term289202.getClass(), "avatarFront", 0);
        setIntField(term289202, term289202.getClass(), "avatarBack", 0);
        setIntField(term289202, term289202.getClass(), "classEmblemBase", 0);
        setIntField(term289202, term289202.getClass(), "classEmblemMedal", 0);
        setIntField(term289202, term289202.getClass(), "stockedGridCount", 0);
        setIntField(term289202, term289202.getClass(), "exMapLoopCount", 0);
        setIntField(term289202, term289202.getClass(), "netBattlePlayCount", 0);
        setIntField(term289202, term289202.getClass(), "netBattleWinCount", 0);
        setIntField(term289202, term289202.getClass(), "netBattleLoseCount", 0);
        setIntField(term289202, term289202.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289202, term289202.getClass(), "charaIllustId", 0);
        setIntField(term289202, term289202.getClass(), "skillId", 0);
        setIntField(term289202, term289202.getClass(), "overPowerPoint", 0);
        setIntField(term289202, term289202.getClass(), "overPowerRate", 0);
        setIntField(term289202, term289202.getClass(), "overPowerLowerRank", 0);
        setIntField(term289202, term289202.getClass(), "avatarPoint", 0);
        setIntField(term289202, term289202.getClass(), "battleRankId", 0);
        setIntField(term289202, term289202.getClass(), "battleRankPoint", 0);
        setIntField(term289202, term289202.getClass(), "eliteRankPoint", 0);
        setIntField(term289202, term289202.getClass(), "netBattle1stCount", 0);
        setIntField(term289202, term289202.getClass(), "netBattle2ndCount", 0);
        setIntField(term289202, term289202.getClass(), "netBattle3rdCount", 0);
        setIntField(term289202, term289202.getClass(), "netBattle4thCount", 0);
        setIntField(term289202, term289202.getClass(), "netBattleCorrection", 0);
        setIntField(term289202, term289202.getClass(), "netBattleErrCnt", 0);
        setIntField(term289202, term289202.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289202, term289202.getClass(), "battleRewardStatus", 0);
        setIntField(term289202, term289202.getClass(), "battleRewardIndex", 0);
        setIntField(term289202, term289202.getClass(), "battleRewardCount", 0);
        setIntField(term289202, term289202.getClass(), "ext1", 0);
        setIntField(term289202, term289202.getClass(), "ext2", 0);
        setIntField(term289202, term289202.getClass(), "ext3", 0);
        setIntField(term289202, term289202.getClass(), "ext4", 0);
        setIntField(term289202, term289202.getClass(), "ext5", 0);
        setIntField(term289202, term289202.getClass(), "ext6", 0);
        setIntField(term289202, term289202.getClass(), "ext7", 0);
        setIntField(term289202, term289202.getClass(), "ext8", 0);
        setIntField(term289202, term289202.getClass(), "ext9", 0);
        setIntField(term289202, term289202.getClass(), "ext10", 0);
        setField(term289202, term289202.getClass(), "extStr1", null);
        setField(term289202, term289202.getClass(), "extStr2", null);
        setLongField(term289202, term289202.getClass(), "extLong1", 0L);
        setLongField(term289202, term289202.getClass(), "extLong2", 0L);
        setField(term289202, term289202.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289202, term289202.getClass(), "isNetBattleHost", false);
        setIntField(term289202, term289202.getClass(), "netBattleEndState", 0);
        term289279 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289279;
        callMethod(klass, "setAvatarSkin", argTypes, term289202, args);
    }

};


