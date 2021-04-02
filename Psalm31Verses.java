package com.ch.data;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Psalm31Verses {
	
	
	String startDateStr = "2021-04-02 00:00:00";
	String pattern = "yyyy-MM-dd H:mm:ss";

	Date startDate;
	
	
	
	private String verses [] = {
	"In you, Lord, I have taken refuge; let me never be put to shame; deliver me in your righteousness",
	"Turn your ear to me, come quickly to my rescue; be my rock of refuge, a strong fortress to save me.",
	"Since you are my rock and my fortress, for the sake of your name lead and guide me.",
	"Keep me free from the trap that is set for me, for you are my refuge.",
	"Into your hands I commit my spirit; <br>deliver me, Lord, my faithful God.",
	"I hate those who cling to worthless idols; <br>as for me, I truts in the Lord.",
	"I will be glad and rejoice in your love, <br>for you saw my affliction and knew the anguish of my soul.",
	"You have not given me into the hands of the enemy <br>but have set my feet in a spacious place.",
	"Be merciful to me, LORD, FOR I am in distress; <br>my eyes grow weak with sorrow, my soul and body with grief.",
	"My life is consumed by anguish and my years by groaning; <br>my strenegth fails because of my affliction, and my bones grow weak.",
	"Because of all my enemies, I am the utter contempt of my neighbors <br> and an object of dread to my closest friends<br>-those who see me on the street flee form me",
	"I am forgotten as though I were dead; <br> I have become like broken pottery.",
	"For I hear many whispering,<br> 'Terror on every side!'<br> They conspire against me and plot to take my life. ",
	"But I trust in you, Lord; I say, 'You are my God'",
	"My time are in your hands;<br> deliver me from the hands of my enemies,<br> for those who pursue me.",
	"Let your face shine on your servant;<br> save me in your unfailing love.",
	"Let me not put to shame and be silent in the realm of the dead.",
	"Let their lying lips be silenced, <br>for their pride and contempt they speak arrogantly against the righteous",
	"How aboundant are the good things that you have stored up for those who fear your,"
	+ "<br> that you bestow in the sight of all, <br> on those who take refuge in you.",
	"In the shelter of your presence you hide them from all human intrigues; <br> you keep them safe in your dwelling from accusing tongues.",
	"Praise be to the Lord, for he show me the wonders of his love <br>when I was in a city under siege.",
	"In my alarm I said, 'I am cut off from your sight!' <br> Yet you heard my cry for mercy when I called you for help.",
	"Love the LORD, all his faithful people! The LORD preserves thoes who are true to him, <br> but the proud he pays back in full.",
	"Be strong and take heart,all you who hope in the LORD."
	
	};

	public Psalm31Verses() {
		
	}
	

	public int getDayNo() {
		
		String str = startDateStr; 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern); 
		LocalDateTime starting  = LocalDateTime.parse(str, formatter);
		
		//	Read more: https://www.java67.com/2016/04/how-to-convert-string-to-localdatetime-in-java8-example.html#ixzz6qn8nD4cJ
		LocalDateTime now = LocalDateTime.now(); 
		
		
		int dayDiff = now.getDayOfMonth() - starting.getDayOfMonth();    
		  
		return dayDiff;   
		
	}

	public String getVerse() {
		int verseNo = getDayNo();
		if (verseNo > verses.length) {
			return verses[verses.length-1];
		} else {
			
			return verses[verseNo];
		}
	}
	
	
	
}
