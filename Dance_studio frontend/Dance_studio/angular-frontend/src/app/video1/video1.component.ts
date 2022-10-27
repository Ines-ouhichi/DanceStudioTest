import { Component, Input, OnInit } from '@angular/core';
import { NgxYoutubePlayerModule } from 'ngx-youtube-player';
import { ResgistrationService } from '../resgistration.service';

@Component({
  selector: 'app-video1',
  templateUrl: './video1.component.html',
  styleUrls: ['./video1.component.css']
})
export class Video1Component implements OnInit {
  videos:any;
  player: any;
  @Input() videoId: string;
  constructor(private service:ResgistrationService) { }

  ngOnInit(): void {
    this.videos = this.service.videos;
  }
 
  playerVars = {
    cc_lang_pref: 'en',
  };
  
  savePlayer(player: any) {
    this.player = player;
  }
 
  playVideo() {
    this.player.playVideo();
  }
 
  pauseVideo() {
    this.player.pauseVideo();
  }
}
